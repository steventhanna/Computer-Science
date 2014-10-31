import kareltherobot.*;

public class DigDug extends Robot {

	public DigDug(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
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
	
	public boolean checkSouthWall() {
		faceSouth();
		if(!frontIsClear()) {
			faceEast();
			return false;
		} else {
			faceEast();
			return true;
		}	
	}
	
	public boolean checkEastWall() {
		faceEast();
		if(!frontIsClear()) {
			faceNorth();
			return false;
		} else {
			faceNorth();
			return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
