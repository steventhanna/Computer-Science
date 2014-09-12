import java.awt.Color;

import kareltherobot.*;

public class BetterTurner extends Robot implements Directions {
	
	// Constructor Method.  Blueprint for robot
	// Constructor must have same name as the class
	public BetterTurner(int street, int avenue, Direction direction, int numberOfBeepers) {
		// Super takes those parameters and puts them into Robots place
		super(street, avenue, direction, numberOfBeepers);
	}
	
	public void turnRight() {
		World.setDelay(0);
		for (int i=3; i>0; i--) {
			turnLeft();
		}
		World.setDelay(25);
	}
	
	public void turnAround() {
		World.setDelay(0);
		turnLeft();
		turnLeft();
		World.setDelay(25);
	}

	public void stepBackwards() {
		World.setDelay(0);
		turnAround();
		move();
		turnAround();
		World.setDelay(25);
	}
	
	public static void main(String[] args) {
		// Initialize world
		World.readWorld("worldOne.kwld");
		World.setVisible(true);
		World.setSize(10, 10);
		// Set beeper color
		World.setBeeperColor(Color.BLUE);
		// Change robot speed
		World.setDelay(25);

		BetterTurner jack = new BetterTurner(5,5,North,1);
		jack.turnAround();
		jack.stepBackwards();
		jack.turnRight();
	}

}
