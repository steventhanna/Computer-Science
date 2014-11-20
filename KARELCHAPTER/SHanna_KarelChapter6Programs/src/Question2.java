/*
 * Steven Hanna
 * Chapter 6, Question 2
 * Purpose: to put a certain amount of beepers in a 6x6 square
 */

import kareltherobot.*;

public class Question2 extends Robot {

	public Question2(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void putBeeper() {
		World.setDelay(0);
		for(int i=5; i>0; i--) {
			super.putBeeper();
		}
		World.setDelay(10);
	}
	
	public void go() {
		for(int x=4; x>0; x--) {
			for(int i=5; i>0; i--) {
				putBeeper();
				move();
			}
			turnLeft();
		}

		
	}

	public static void main(String[] args) {
		World.setDelay(10);
		World.setVisible(true);
		
		Question2 john = new Question2(2,7,North,infinity);
		john.go();
	}

}
