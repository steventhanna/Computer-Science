/*
 * Steven Hanna
 * Main class for the beeper steeple objective
 */

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
	
	// An enhanced picker
	public void simplePick() {
		if(nextToABeeper()) {
			pickBeeper();
		}
	}
	
	// The below are for orientation
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
	
	// Depreciated 
	public void go() {
		faceEast();
	}
	
	// A better pickBeeper()
	public void pickBeeper() {
		if(nextToABeeper()) {
			super.pickBeeper();
		}
	}
	
	// The pickAllBeeper method.  
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
