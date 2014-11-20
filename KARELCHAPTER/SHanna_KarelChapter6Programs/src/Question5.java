/*
 * Steven Hanna
 * Chapter 6, Question 5
 * Purpose: clear all beepers in a room
 */
import kareltherobot.*;

public class Question5 extends Robot {

	public Question5(int street, int avenue, Direction direction, int beepers) {
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
	
	public void goToLeftCorner() {
		faceSouth();
		while(frontIsClear()) {
			move();
		}
		faceWest();
		while(frontIsClear()) {
			move();
		}
		faceNorth();
	}
	
	public void run() {
		while(frontIsClear()) {
			while(nextToABeeper()) {
				pickBeeper();
			}
			move();
		}
		if(facingNorth()) {
			faceEast();
			move();
			while(nextToABeeper()) {
				pickBeeper();
			}
			faceSouth();
			run();
		}
		if(facingSouth()) {
			faceEast();
			move();
			while(nextToABeeper()) {
				pickBeeper();
			}
			faceNorth();
			run();
		}
	}
	
	public void go() {
		goToLeftCorner();
		run();
	}
	
	
	public static void main(String[] args) {
		World.setDelay(10);
		World.readWorld("question4.kwld");
		World.setVisible(true);
		
		Question5 joe = new Question5(5,5,North,0);
		joe.go();
	}

}
