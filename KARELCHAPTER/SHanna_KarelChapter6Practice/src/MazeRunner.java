import kareltherobot.*;

public class MazeRunner extends Robot {

	public MazeRunner(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
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
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public void go() {
		faceEast();
		while(frontIsClear()) {
			move();
		}
		if(!frontIsClear()) {
			turnRight();
		}
	}

	public static void main(String[] args) {
		World.setDelay(10);
		World.readWorld("maze1.kwld");
		World.setVisible(true);
		
		MazeRunner bob = new MazeRunner(1,1,East,infinity);
		bob.go();
	}

}
