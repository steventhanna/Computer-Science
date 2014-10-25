import kareltherobot.*;

public class BeeperSteeple extends Robot {

	public BeeperSteeple(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void pickAmount(int j) {
		for(int i=j; i>0; i--) {
			if(nextToABeeper()) {
				pickBeeper();
			}
			move();
		}
	}
	
	public void simplePick() {
		if(nextToABeeper()) {
			pickBeeper();
		}
	}
	
	public boolean faceNorth() {
		while(!facingNorth()) {
			turnLeft();
		}
		
		if(facingNorth()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean faceSouth() {
		while(!facingSouth()) {
			turnLeft();
		}
		
		if(facingSouth()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean faceEast() {
		while(!facingEast()) {
			turnLeft();
		}
		
		if(facingEast()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean faceWest() {
		while(!facingWest()) {
			turnLeft();
		}
		
		if(facingWest()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void go() {
		faceEast();
		
	}
	
	public void pickBeeper() {
		if(nextToABeeper()) {
			super.pickBeeper();
		}
	}
	
	public void pickAllBeepers() {
		faceEast();
		while(!nextToABeeper()) {
			move();
		}
		if(nextToABeeper()) {
			faceNorth();
			while(nextToABeeper()) {
				move();
			}
			faceSouth();
			while(frontIsClear()) {
				move();
				pickBeeper();
			}
			faceEast();
		}
		pickAllBeepers();
	}

}
