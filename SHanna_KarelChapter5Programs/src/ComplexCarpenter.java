import kareltherobot.*;

public class ComplexCarpenter extends Robot {

	public ComplexCarpenter(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
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
	
	public void returnToGround() {
		faceSouth();
		while(frontIsClear()) {
			move();
		}
		
	}
	
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
	
	public void layBeeper() {
		while(wallToEast() && wallToWest()) {
			faceSouth();
			putBeeper();
			move();
			}
	}
	
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
