import java.awt.Color;

import kareltherobot.*;

public class FieldPicker extends Robot implements Directions{

	public FieldPicker(int street, int avenue, Direction direction, int numberOfBeepers) {
		super(street, avenue, direction, numberOfBeepers);
	}
	
	public void pickTwo() {
		move();
		move();
		pickBeeper();
		move();
		pickBeeper();
	}
	
	public void turnRight() {
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(25);
	}
 	
	
	public static void main(String[] args) {
		// Initialize world
		World.readWorld("fieldExampleWorld.kwld");
		World.setVisible(true);
		World.setSize(10, 10);
		// Set beeper color
		World.setBeeperColor(Color.BLUE);
		// Change robot speed
		World.setDelay(25);

		FieldPicker krishna = new FieldPicker(1,3,North,1);
		krishna.move();
		krishna.pickBeeper();
		krishna.move();
		krishna.pickBeeper();
		krishna.move();
		krishna.pickTwo();
		krishna.turnRight();
		krishna.move();
		krishna.pickTwo();
	}

}
