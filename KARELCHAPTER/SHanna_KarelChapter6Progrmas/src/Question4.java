/*
 * Steven Hanna
 * Chapter 6, Question 4
 * Purpose: write a perimeter of beepers around a fence like structure
 */
import kareltherobot.*;

public class Question4 extends Robot {

	public Question4(int street, int avenue, Direction direction, int beepers) {
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
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public boolean checkLeftWall() {
		turnLeft();
		if(!frontIsClear()) {
			turnRight();
			return true;
		} else {
			turnRight();
			return false;
		}
		
	}
	
	public void go() {
		if(nextToABeeper()) {
			turnOff();
		}
		if(checkLeftWall() && frontIsClear()) {
			putBeeper();
			move();
			go();
		} else if(!frontIsClear()) {
			turnRight();
			go();
		}
		if(!checkLeftWall()) {
			turnLeft();
			putBeeper();
			move();
			putBeeper();
			turnLeft();
			move();
			go();
		}
	}

	public static void main(String[] args) {
		World.setDelay(5);
		World.readWorld("question42.kwld");
		World.setVisible(true);
		
		Question4 mark = new Question4(5,5,East,infinity);
		mark.go();
	}

}
