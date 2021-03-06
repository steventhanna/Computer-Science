/* 
 * Steven Hanna
 * Purpose: to implement the answer to question 2
 */

import kareltherobot.*;

public class Question2 extends BetterMethods implements Directions {

	public Question2(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	public static void main(String[] args) {
		World.readWorld("baseball.kwld");
		World.setVisible(true);
		World.setDelay(20);
		
		
		// Init robot
		BetterMethods eddie = new BetterMethods(1,6,North,1);
		
		eddie.moveToOrigin();
		eddie.clearWorldOfBeepers();
	}

}
