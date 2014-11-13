/*
 * Steven Hanna
 * This is a class containing several methods that improve upon the
 * older version of Robot.  This needs to be extended by other classes.
 * 
 */
import kareltherobot.*;

public class BetterMethods extends Robot implements Directions {


	public BetterMethods(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void turnRight() {
		World.setDelay(0);
		for(int i=3; i>0; i-- ) {
			turnLeft();
		}
		World.setDelay(10);
	} 
	
	public void turnAround() {
		World.setDelay(0);
		turnRight();
		turnRight();
		World.setDelay(10);
	}
	
	public void moveToOrigin() {
		turnLeft();
		for(int i=5; i>0; i--) {
			move();
		}
		turnRight();
	}
	
	public void checkBeeperAndGo() {
		if(nextToABeeper()) {
			pickBeeper();
			clearWorldOfBeepers();
		} else {
			clearWorldOfBeepers();
		}
	}
	
	public void onlyCheckBeeper() {
		if(nextToABeeper()) {
			pickBeeper();
		}
	}
	
	public void clearWorldOfBeepers() {
		// Start Robot at 1,1, North
		while(frontIsClear()) {
			World.setDelay(10);
			move();
			checkBeeperAndGo();
		}
		if(facingNorth()) {
			turnRight();
			move();
			onlyCheckBeeper();
			turnRight();
			clearWorldOfBeepers();
		} else if(facingSouth()) {
			turnLeft();
			move();
			onlyCheckBeeper();
			turnLeft();
			clearWorldOfBeepers();
		}
	}
	
	public void pickBeeper() {
		if(nextToABeeper()) {
			super.pickBeeper();
		}
	}
	
	public void clearNorth() {
		faceNorth();
		for(int i=10; i>0; i--) {
			pickBeeper();
			move();
		}
		turnRight();
		move();
		pickBeeper();
		turnRight();
	}
	
	public void clearSouth() {
		for(int i=10; i>0; i--) {
			pickBeeper();
			move();
		}
		turnLeft();
		move();
		pickBeeper();
		turnLeft();
	}
	
	public void clearAllTen() {
		faceNorth();
		for(int i=5; i>0; i--) {
			clearNorth();
			clearSouth();
		}
	}
	
	public void faceNorth() {
		while(!facingNorth()) {
			turnLeft();
		}
	}

	public void faceSouth() {
		while(!facingSouth()) {
			turnLeft();
		}
	}
	
	public void faceEast() {
		while(!facingEast()) {
			turnLeft();
		}
	}
	
	public void faceWest() {
		while(!facingNorth()) {
			turnLeft();
		}
	}
	
	public void teleport(int street, int avenue, Direction Direction, int beeperAmount) {

		setVisible(false);
		turnOff();
		new BetterMethods(street, avenue, Direction, beeperAmount);
		
	}
	
}
