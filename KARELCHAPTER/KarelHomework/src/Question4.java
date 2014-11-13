/*
 * Steven Hanna
 * This is the program that runs question 4.  
 * Includes CarpetPlace.java.  
 * Purpse: allow robot to place a "carpet" of beepers around
 * a square path.
 */

import kareltherobot.*;

public class Question4 extends CarpetPlace implements Directions {

	public Question4(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	public static void main(String[] args) {
		World.readWorld("carpet.kwld");
		World.setVisible(true);
		World.setDelay(15);
		
		CarpetPlace janice = new CarpetPlace(9,2,South, 28);
		janice.placeCarpet();
		janice.turnOff();
		
	}

}
