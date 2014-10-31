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
			return true;
		} else {
			return false;
		}	
	}
	
	public boolean checkEastWall() {
		faceEast();
		if(!frontIsClear()) {
			faceNorth();
			return true;
		} else {
			faceNorth();
			return false;
		}
	}
	
	public boolean checkWestWall() {
		faceWest();
		if(!frontIsClear()) {
			faceNorth();
			return true;
		} else {
			faceNorth();
			return false;
		}
	}
	
	public void go() {
		while(checkSouthWall()) {
			faceEast();
			move();
		}
		faceSouth();
		while(frontIsClear()) {
			move();
		}
		faceNorth();
		while(frontIsClear() && (checkEastWall() || checkWestWall())) {
			while(nextToABeeper()) {
				pickBeeper();
				System.out.println("PickBeeper");
			}
			move();
		}
		faceEast();
		move();
		go();
	}
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.readWorld("dig1.kwld");
		World.setDelay(5);
		
		DigDug john = new DigDug(8,1,East,0);
		john.go();

	}

}
