import kareltherobot.*;
 
public class LoopyKarel extends Robot {

	public LoopyKarel(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	public void turnRight() {
		for(int i=3; i>0; i--) {
			turnLeft();
		}
	}
	
	
	public void walkSquareOfLength(int amountPerSide) {
		for(int i=4; i>0; i--) {
			for(int x=amountPerSide; x>0; x--) {
				move();
				putBeeper();
			}
			turnLeft();
		}
	}
	
	public void walkSquareOfLength(int amountPerSide, int amountOfBeepers) {
		for(int i=4; i>0; i--) {
			for(int x = amountPerSide; x>0; x--) {
				for(int j=amountOfBeepers; j>0; j--) {
					putBeeper();
				}
				super.move();
			}
			turnLeft();
		}
	}
	
	// overloaded method
	public void move(int numOfMoves) {
		for(int i=0; i< numOfMoves; i++) {
			move();
		}
	}
	
	public void move(int numOfMoves, int numOfBeepers) {
		for(int i = 0; i < numOfMoves; i++) {
			for(int j = 0; j < numOfBeepers; j++) {
				putBeeper();
			}
			move();
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
	
	public void clearAllBeepersToWall() {
		while(frontIsClear()) {
			move();
			while(nextToABeeper()) {
				pickBeeper();
			}
		}
	}
	
	public void findBeeper() {
		clearAllBeepersToWall();
		if(facingSouth()) {
			turnLeft();
			move();
			if(nextToABeeper()) {
				pickBeeper();
			}
			turnLeft();
		} else if(facingNorth()) {
			turnRight();
			move();
			if(nextToABeeper()) {
				pickBeeper();
			}
			turnRight();
		}
		findBeeper();
	}
	
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(10);
		World.readWorld("example3B.kwld");
		LoopyKarel eddie = new LoopyKarel(6,2,North,infinity);	
//		eddie.clearAllBeepersToWall();
//		eddie.turnLeft();
//		eddie.move();
		eddie.findBeeper();
		

	}

}
