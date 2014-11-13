/*
 * Steven Hanna
 * The main java file for the carpenter objective
 */
import kareltherobot.*;

public class Carpenter extends Robot {

	public Carpenter(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	// Orientation
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
	// Check for rooms above first level
	public boolean checkForRooms() {
		faceNorth();
		if(frontIsClear()) {
			move();
			if(frontIsClear()) {
				faceSouth();
				move();
				faceEast();
				return false;
			} else {
				faceWest();
				if(!frontIsClear()) {
					faceEast();
					if(!frontIsClear()) {
						faceSouth();
						return true;
					} else {
						faceSouth();
						move();
						faceEast();
						return false;
					}
				} else {
					faceSouth();
					move();
					faceEast();
					return false;
				}
			}
		} else {
			faceEast();
			move();
			return false;
		}
		
	}
	
	// Integration of checkForRooms()
	public void carpet() {
		// facing east
		faceEast();
		while(frontIsClear()) {
			if(checkForRooms()) {
				putBeeper();
				faceSouth();
				move();
			}
			faceEast();
			move();
		}
	}
	
	

}
