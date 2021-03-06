/*
 * Steven Hanna
 * Purpose: to run the first question, setting a series of pins
 * in the world.
 */

import kareltherobot.*;
import java.lang.String;

public class Question1 extends PinSetter {

	public Question1(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(1);
		
		// Init robot at 1,5,North,10
		
		PinSetter john = new PinSetter(1,5,North,10);
		BetterMethods joe = new BetterMethods(1,3,North,10);
		john.move();
		john.createBorder();
		john.fillCenter();
		john.setVisible(true);
		// john.teleport(1, 1, North, 1, "PinSetter");
		joe.teleport(5, 5, West, 1);
		joe.putBeeper();
		
		
	}

}
