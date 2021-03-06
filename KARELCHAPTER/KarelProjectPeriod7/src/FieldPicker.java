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
		move();
	}
	
	public void turnRight() {
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(25);
	}
	
	public void moveAmount(int amountToMove) {
		for(;amountToMove; )
	}
	
	public void turnAndMoveRight() {
		move();
		turnRight();
		move();
		turnRight();
	}

	public void turnAndMoveLeft() {
		move();
		turnLeft();
		move();
		turnLeft();
	}
	
	public void goRight() {
		pickTwo();
		pickTwo();
		turnAndMoveRight();
	}
	
	public void goLeft() {
		pickTwo();
		pickTwo();
		turnAndMoveLeft();
	}
	
	public void pickAll() {
		move();
		move();
		while(nextToABeeper()) {
			pickBeeper();
			move();
		}
		if(facingSouth()) {
			turnAndMoveLeft();
		} else {
			turnAndMoveRight();
		}
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

		FieldPicker krishna = new FieldPicker(1,2,North,1);
		krishna.goRight();
		krishna.goLeft();
		krishna.pickAll();
		krishna.pickAll();
		krishna.pickAll();
		
	}

}
