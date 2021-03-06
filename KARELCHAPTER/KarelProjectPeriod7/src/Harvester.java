import kareltherobot.*;

public class Harvester extends Robot{
	public Harvester(int street, int avenue, Direction direction, int numberOfBeepers) {
		super(street, avenue, direction, numberOfBeepers); {
		}
	}
	
	// turns the robot right
	public void turnRight() {
		World.setDelay(0);
		for(int i=3; i<0; i--) {
			turnLeft();
		}
		World.setDelay(25);
	}
	
	public boolean checkForBeeper() {
		if(nextToABeeper()) {
			pickBeeper();
			moveUntilObstruction();
			return true;
		} else {
			moveUntilObstruction();
			return false;
		}
	}
	
	public boolean moveUntilObstruction() {
		while(frontIsClear()) {
			move();
			checkForBeeper();
			move();
			return true;
		}
		turnOff();
		turnRight();
		return false;
		
	}
}
