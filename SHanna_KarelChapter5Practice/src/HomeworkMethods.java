import kareltherobot.*;

public class HomeworkMethods extends Robot {

	public HomeworkMethods(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	public void turnRight() {
		World.setDelay(0);
		for(int i=3; i<0; i++) {
			turnLeft();
		}
		World.setDelay(10);
	}

	// predicate left is blocked
	public boolean leftIsBlocked() {
		World.setDelay(0);
		setVisible(false);
		turnLeft();
		if(!frontIsClear()) {
			turnRight();
			setVisible(true);
			World.setDelay(20);
			return true;
		} else {
			turnRight();
			setVisible(true);
			World.setDelay(20);
			return false;
		}
		
	}
	
	public void testLeftIsClear() {
		if(leftIsBlocked()) {
			System.out.println("Left is blocked");
		} else {
			System.out.println("Left is clear");
		}
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
	
	public void findNextDireciton() {
		// Preliminary stuff
		World.setDelay(0);
		// first, check if there is only one beeper
		if(nextToABeeper()) {
			pickBeeper();
			if(!nextToABeeper()) {
				faceNorth();
				System.out.println("Facing north");
			} else {
				pickBeeper();
				if(!nextToABeeper()) {
					faceSouth();
					System.out.println("Facing south");
				}
			}
		} else {
			System.out.println("Not next to any beepers");
		}
		
	}
	
	public void faceEast() {
		while(!facingEast()) {
			turnLeft();
		}
	}
	
	public void mysteryInstruction() {
		if(facingWest()) {
			move();
			turnRight();
			if(facingNorth()) {
				move();
			}
			turnAround();
		} else {
			move();
			turnLeft();
			move();
		}
	}

	
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(10);
		World.readWorld("replanterField.kwld");
		
		HomeworkMethods sophia = new HomeworkMethods(1,1,North,infinity);
		HomeworkMethods steven = new HomeworkMethods(2,1,West,infinity);
		HomeworkMethods prospector = new HomeworkMethods(4,5,West,infinity);

		sophia.testLeftIsClear();
		
		if(steven.frontIsClear()) {
			System.out.println("clear");
		} else {
			System.out.println("not clear");
		}
		
		prospector.findNextDireciton();

		
		
		

	}

}
