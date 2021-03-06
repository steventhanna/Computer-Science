/*
 * Steven Hanna
 * Purpose: to establish the borders for PinSetter.
 */

import kareltherobot.*;

public class PinSetter extends BetterMethods implements Directions {

	public PinSetter(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void rightBorder() {
		putBeeper();
		for(int i=3; i>0; i--) {
			move();
			turnRight();
			move();
			putBeeper();
			turnLeft();
		}
	}
	
	public void topBorder() {
		turnLeft();
		for(int i=3; i>0; i--) {
			move();
			move();
			putBeeper();
		}
	}
	
	public void leftBorder() {
		turnLeft();
		for(int i=3; i>0; i--) {
			move();
			turnLeft();
			move();
			putBeeper();
			turnRight();
		}
	}
	
	public void createBorder() {
		rightBorder();
		topBorder();
		leftBorder();
		pickBeeper();
	}
	
	public void fillCenter() {
		turnAround();
		move();
		move();
		putBeeper();
		move();
		move();
		move();
	}
	
}
