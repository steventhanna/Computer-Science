/*
 * Steven Hanna
 * Chapter 3 Question 2
 * Purpose: harvest all of the beepers in a given field.   
 * 
 */
import kareltherobot.*;

public class Question2 extends BetterMethods implements Directions {

	public Question2(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	public static void main(String[] args) {
		World.readWorld("baseball.kwld");
		World.setVisible(true);
		World.setDelay(10);
		
		
		// Init robot
		BetterMethods eddie = new BetterMethods(1,1,North,1);
		
		eddie.clearAllTen();
	}

}
