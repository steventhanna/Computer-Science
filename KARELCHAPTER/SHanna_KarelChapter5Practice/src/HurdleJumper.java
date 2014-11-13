import kareltherobot.*;

public class HurdleJumper extends Robot {
	private int myDelay;
	
	public HurdleJumper(int street, int avenue, Direction direction, int beepers, int myDelay) {
		super(street, avenue, direction, beepers);
		int delay = myDelay;
		
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
		World.setDelay(0);
		World.setVisible(true);
		World.readWorld("jumpingWorld.kwld");
		
		HurdleJumper john = new HurdleJumper(1,1,East,infinity, 10);
		john.go();

	}

}
