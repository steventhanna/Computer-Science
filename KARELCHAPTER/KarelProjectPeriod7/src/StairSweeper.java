import java.awt.Color;
import kareltherobot.*;

public class StairSweeper extends Robot implements Directions {

	public StairSweeper(int street, int avenue, Direction direction, int numberOfBeepers) {
		super(street, avenue, direction, numberOfBeepers);
	}
	
	public void checkForBeeper() {
		if (nextToABeeper()) {
			pickBeeper();
		}
	}
	
	public void turnRight() {
		World.setDelay(0);
		for (int i=3; i>0; i--) {
			turnLeft();
		}
		World.setDelay(25);
	}
	
	public void sweepStairs() {
		checkForBeeper();
		move();
		turnRight();
		move();
		checkForBeeper();
		while (frontIsClear()) {
			turnOff();
		}
		turnLeft();
		sweepStairs();
	}

	public static void main(String[] args) {
		// Initialize world
		World.readWorld("stairworld.kwld");
		World.setVisible(true);
		World.setSize(10, 10);
		// Set beeper color
		World.setBeeperColor(Color.BLUE);
		// Change robot speed
		World.setDelay(25);
		
		StairSweeper john = new StairSweeper(1, 1, North, 10);
		john.sweepStairs();
		
	}

}
