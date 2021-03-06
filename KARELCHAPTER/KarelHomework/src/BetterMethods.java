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
		World.setDelay(25);
	} 
	
	public void turnAround() {
		World.setDelay(0);
		turnRight();
		turnRight();
		World.setDelay(25);
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
	
	public void teleport(int street, int avenue, Direction Direction, int beeperAmount) {

		setVisible(false);
		turnOff();
		new BetterMethods(street, avenue, Direction, beeperAmount);
		
	}
	
}
