import kareltherobot.*;

public class Hurdler extends Robot {

	public Hurdler(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public boolean turnRightAndCheck() {
		// run facingNorth();
		turnRight();
		if(!frontIsClear()) {
			turnLeft();
			move();
			return true;
		} else {
			move();
			faceSouth();
			returnToBottom();
			return false;
		}
	}
	
	public void faceSouth() {
		while(!facingSouth()) {
			turnLeft();
		}
	}
	
	public void returnToBottom() {
		if(facingSouth()) {
			while(frontIsClear()) {
				move();
			}
			turnLeft();
			turnLeft();
			turnRightAndCheck();
		}
	}
	
	
	public void checkForWall() {
		while(facingNorth()) {
			turnRightAndCheck();
		}
	}



}
