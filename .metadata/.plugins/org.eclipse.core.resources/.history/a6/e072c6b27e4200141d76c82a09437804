import kareltherobot.*;

public class CarpetPlace extends BetterMethods implements Directions {

	public CarpetPlace(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void checkForBeeper() {
		if(nextToABeeper()) {
			move();
			placeCarpet();
		} else if(nextToABeeper() == false) {
			putBeeper();
			move();
			placeCarpet();
		}
	}
	
	
	public void placeCarpet() {
		World.setDelay(5);
		// robot starting at 10,2,south
		while(frontIsClear()) {
			checkForBeeper();
		}
		while(frontIsClear() == false) {
			turnLeft();
		}
		if(anyBeepersInBeeperBag() == false) {
			setVisible(false);
			turnOff();
		}
		placeCarpet();
	}

}
