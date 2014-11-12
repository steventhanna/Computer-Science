/*
 * Steven Hanna
 * Chapter 6, Question 3
 * Purpose: escape from a box
 */

import kareltherobot.*;

public class Question3 extends Robot {

	public Question3(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	public void faceNorth() {
		while(!facingNorth()) {
			turnLeft();
		}
	}

	public void faceSouth() {
		while(!facingSouth()) {
			turnLeft();
		}
	}
	
	public void faceEast() {
		while(!facingEast()) {
			turnLeft();
		}
	}
	
	public void faceWest() {
		while(!facingWest()) {
			turnLeft();
		}
	}
	
	public void findDirection() {
		while(frontIsClear()) {
			turnLeft();
		}
		if(facingEast()) {
			faceNorth();
		}
		if(facingWest()) {
			faceSouth();
		}
		if(facingSouth()) {
			faceEast();
		}
		if(facingNorth()) {
			faceWest();
		}
	}
	
	public void goToEdge() {
		while(frontIsClear()) {
			move();
		}
	}
	
	public void init() {
		goToEdge();
		findDirection();
	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public boolean checkRightWall() {
		turnRight();
		if(frontIsClear()) {
			move();
			move();
			return false;
		} else {
			turnLeft();
			return true;
		}
	}
	
	public void go() {
		init();
		putBeeper();
		while(checkRightWall()) {
			if(frontIsClear()) {
				move();
			}
			if(!frontIsClear()) {
				turnLeft();	
			}
			if(nextToABeeper()) {
				turnOff();
			}
			
		}
		
	}
	
	

	public static void main(String[] args) {
		World.setDelay(10);
		World.readWorld("question3.kwld");
		World.setVisible(true);
		
		Question3 joe = new Question3(5,5,North,1);
		joe.go();

	}

}
