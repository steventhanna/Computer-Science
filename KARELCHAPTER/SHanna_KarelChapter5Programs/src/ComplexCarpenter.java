/*
 * Steven Hanna
 * The main class file for the ComplexCarpenter objective
 */
import kareltherobot.*;

public class ComplexCarpenter extends Robot {

	public ComplexCarpenter(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
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
	
	// Check for walls
	public boolean wallToWest() {
		faceWest();
		if(frontIsClear()) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean wallToEast() {
		faceEast();
		if(frontIsClear()) {
			return false;
		} else {
			return true;
		}
	}
	
	// Return to ground
	public void returnToGround() {
		faceSouth();
		while(frontIsClear()) {
			move();
		}
		
	}
	
	// Main implementation of methods
	public boolean wallsOnSides() {
		faceNorth();
		move();
		// if room directly in front of robot
		
		while(frontIsClear() && wallToWest() && wallToEast()) {
			faceNorth();
			move();
		}
		
		if(!frontIsClear() && wallToWest() && wallToEast()) {
			faceSouth();
			// putBeeper();
			layBeeper();
			return true;
		} else {
			returnToGround();
			return false;
			
		}
		
		
		
		
	}
	
	// Lay the beepers
	public void layBeeper() {
		while(wallToEast() && wallToWest()) {
			faceSouth();
			putBeeper();
			move();
			}
	}
	
	// Final implementation
	// Call this on final 
	public void go() {
		wallsOnSides();
		if(facingSouth() && !frontIsClear()) {
			faceEast();
			move();
			go();
		}
		faceEast();
		move();
		go();
		
	}
	
	

}
