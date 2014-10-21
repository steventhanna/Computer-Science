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
	
	public void pickAllBeepers() {
		faceNorth();
		while(facingNorth()) {
			pickAmount(9);
			simplePick();
			faceEast();
			move();
			simplePick();
			faceSouth();
		}
		while(facingSouth()) {
			pickAmount(9);
			simplePick();
			faceEast();
			move();
			simplePick();
			faceNorth();
		}
		
		
		
	}

}
