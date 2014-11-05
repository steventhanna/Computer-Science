/*
 * Steven Hanna
 * The methods for the hurdler objective
 */

import kareltherobot.*;

public class Hurdler extends Robot {

	public Hurdler(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	// Turn right
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	// Turn right and check for wall
	public boolean turnRightAndCheck() {
		// run facingNorth();
		turnRight();
		if(!frontIsClear()) {
			turnLeft();
			move();
			return true;
		} else {
			move();
			faceSouth();
			returnToBottom();
			return false;
		}
	}
	
	// Orientation
	public void faceSouth() {
		while(!facingSouth()) {
			turnLeft();
		}
	}
	
	// Return to bottom
	public void returnToBottom() {
		if(facingSouth()) {
			while(frontIsClear()) {
				move();
			}
			turnLeft();
			turnLeft();
			turnRightAndCheck();
		}
	}
	
	// Check for wall at north
	public void checkForWall() {
		while(facingNorth()) {
			turnRightAndCheck();
		}
	}



}
