import kareltherobot.*;

public class HurdleJumper extends Robot {

	public HurdleJumper(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}

	public void turnRight() {
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(20);
	}
	
	public void go() {
		while(frontIsClear()) {
			move();
		}
		if(!frontIsClear()) {
			turnLeft();
			move();
			turnRight();
			move();
			turnRight();
			move();
			turnLeft();
			go();
		}
	}
	
	public static void main(String[] args) {
		World.setDelay(20);
		World.setVisible(true);
		World.readWorld("jumpingWorld.kwld");
		
		HurdleJumper john = new HurdleJumper(1,1,East,infinity);
		john.go();

	}

}
