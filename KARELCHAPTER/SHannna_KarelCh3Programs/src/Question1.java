/*
 * Steven Hanna
 * Chapter 3 Question 1
 * Purpose: to lay a series of pins
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
		john.move();
		john.createBorder();
		john.fillCenter();
		john.setVisible(true);
		
		
	}

}
