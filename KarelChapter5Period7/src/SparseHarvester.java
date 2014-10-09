import kareltherobot.*;

public class SparseHarvester extends Robot {

	public SparseHarvester(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	public void turnRight() {
		for(int i=3; i>0; i--) {
			turnLeft();
		}
	}
	
	public void beepAndMove() {
		if(nextToABeeper()) {
			pickBeeper();
		}
		move();
	}
	
	public void checkBeeper() {
		if(nextToABeeper()) {
			pickBeeper();
		}
	}
	
	public void specificHarvester() {
		for(int i=10; i>0; i--) {
			if(frontIsClear()) {
				beepAndMove();
			}
		}
			if(facingNorth()) {
				checkBeeper();
				turnRight();
				move();
				checkBeeper();
				turnRight();
				specificHarvester();
			} else if(facingSouth()) {
				checkBeeper();
				turnLeft();
				move();
				checkBeeper();
				turnLeft();
				specificHarvester();
			}
		}
	
	public void faceNorthIfFacingSouth() {
		if(facingSouth()) {
			turnLeft();
			turnLeft();
		}
	}
	
	public void harvestAll() {
		// Start robot at 1,1,North
		if(frontIsClear()) {
			beepAndMove();
			harvestAll();
		} else if(facingNorth()) {
			checkBeeper();
			turnRight();
			move();
			checkBeeper();
			turnRight();
			harvestAll();
		} else if(facingSouth()) {
			checkBeeper();
			turnLeft();
			move();
			checkBeeper();
			turnLeft();
			harvestAll();
		}
	}
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(10);
		World.readWorld("randomField.kwld");
		
		
		SparseHarvester rob = new SparseHarvester(1,1,North,0);
		rob.specificHarvester();
	}

}
