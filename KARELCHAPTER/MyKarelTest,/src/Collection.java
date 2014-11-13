import java.awt.Color;

import kareltherobot.*;

public class Collection extends Robot implements Directions {
	
	public Collection(int street, int avenue, Direction direction, int numberOfBeepers) {
		super(street, avenue, direction, numberOfBeepers);
	}
	
	// Check for beepers in front of the robot.
	public boolean checkForBeepers() {
		while (nextToABeeper()) {
			// If next to a beeper, pick it up and return true
			pickBeeper();
			return true;
		}
		// Otherwise, move until obstruction.  Feedback loop?
		moveUntilObstruction();
		return false;
	}
	
	// Orient robot
	public boolean orientNorth() {
		if (facingNorth()) {
			return true;
		} else if (facingSouth()) {
			turnLeft();
			turnLeft();
			return false;
		} else if (facingEast()) {
			turnLeft();
			return false;
		} else {
			turnRight();
			return false;
		}
	}
	
	public boolean orientEast() {
		if (facingEast()) {
			return true;
		} else if (facingNorth()) {
			turnRight();
			return false;
		} else if (facingSouth()) {
			turnLeft();
			return false;
		} else {
			turnLeft();
			turnLeft();
			return false;
		}
	}
	
	public boolean orientSouth() {
		if (facingSouth()) {
			return true;
		} else if (facingWest()) {
			turnLeft();
			return false;
		} else if (facingNorth()) {
			turnLeft();
			turnLeft();
			return false;
		} else {
			turnRight();
			return false;
		}

	}
	
	public boolean orientWest() {
		if (facingWest()) {
			return true;
		} else if (facingNorth()) {
			turnLeft();
			return false;
		} else if (facingEast()) {
			turnLeft();
			turnLeft();
			return false;
		} else {
			turnRight();
			return false;
		}
	}
	// End orientation
	public void turnAndStepLeft() {
		turnLeft();
		if (frontIsClear()) {
			moveUntilObstruction();
		} else {
		move();
		turnLeft();
		moveUntilObstruction();
		}
	}
	
	public void turnAndStepRight() {
		turnRight();
		if (frontIsClear()) {
			moveUntilObstruction();
		} else {
		move();
		turnRight();
		moveUntilObstruction();
		}
	}

	/* Start with robot facing north, in position 1,1.
	 * Snake up and down the line. 
	 * If the front is clear, check for beepers in front.
	 * If found, pick them up, and continue.  Else, 
	 * just move on.  Once robot comes in contact with wall, 
	 * turn left.
	 */
	


	// Define method turn right as thrice turn left
	public void turnRight() {
		for (int i = 3; i>0; i--) {
			turnLeft();
		}
	}
	
	
	public void collectAllBeepers() {
		// While condition front is clear == true
		if (nextToABeeper()) {
			pickBeeper();
		}
	}
	
	
	public boolean moveUntilObstruction() {
		while (frontIsClear()) {
			// Move forward and check for beepers
			move();
			checkForBeepers();
			moveUntilObstruction();
			return true;
		}
		// Analyze direction and decide whether to turn left or right
		if (facingSouth()) {
			
			turnAndStepLeft();
		} else {
			turnAndStepRight();
		} 
		return false;
	}

	public boolean newCheckForBeepers() {
		while (nextToABeeper()) {
			pickBeeper();
			return true;
		}
		newMoveUntilObstruction();
		return false;
	}
	
	
	public boolean goLeft() {
		if (frontIsClear()) {
			return true;
		} else {
			turnLeft();
			newMoveUntilObstruction();
			return false;
		}
	}

	public boolean newMoveUntilObstruction() {
		while (frontIsClear()) {
			move();
			newCheckForBeepers();
			return true;
		}
		turnLeft();
		return false;
	}
	
	public static void main(String[] args) {
		// Initialize world
		World.readWorld("worldOne.kwld");
		World.setVisible(true);
		World.setSize(10, 10);
		// Set beeper color
		World.setBeeperColor(Color.BLUE);
		// Change robot speed
		World.setDelay(15);
		Collection joe = new Collection(1, 1, North, 10);
		joe.moveUntilObstruction();
	}
	
	

	
	
	
}
