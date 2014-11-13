/*
 * Comparison operators
 * < less than
 * <= less than or equal to
 * == equals
 * !- not equals
 * ! negation operator
 */
import kareltherobot.*;

public class CheckerRobot extends Robot {

	public CheckerRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}
	
	// First predicate
	// Only tests the world, and dooes not change it
	// Predicates must not change the enviornment
	public boolean frontIsBlocked() {
		if(!frontIsClear()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean noNextToABeeper() {
		if(!nextToABeeper()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public boolean rightIsClear() {
		World.setDelay(0);
		setVisible(false);
		turnRight();
		if(!frontIsClear()) {
			turnLeft();
			setVisible(true);
			World.setDelay(10);
			return true;
		} else {
			turnLeft();
			setVisible(true);
			World.setDelay(10);
			return false;
		}
		
	}
	
	public boolean facingEastOrWest() {
		if(facingEast()) {
			return true;
		} else if(facingWest()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] arsg) {

		
		
		int x = 4;
		
		boolean someValue = (x > 5);
		
		System.out.println(someValue);
		
		
		if(someValue != true) {
			
		}
	}

}
