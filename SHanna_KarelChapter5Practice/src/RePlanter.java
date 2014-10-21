import kareltherobot.*;

public class RePlanter extends Robot {

	public RePlanter(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}

	
	public void checkForTwo() {
		World.setDelay(0);
		if(nextToABeeper()) {
			pickBeeper();
			if(nextToABeeper()) {
				World.setDelay(20);
				move();
			} else {
				putBeeper();
				World.setDelay(20);
				move();
			}
		}
	}
	
	public void placeBeeperIfNone() {
		World.setDelay(0);
		if(!nextToABeeper()) {
			putBeeper();
		}
		World.setDelay(10);
	}

	public void turnRight() {
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(10);
	}
	
	public void launch() {
		for(int i=6; i>0; i--) {
			checkForTwo();
			placeBeeperIfNone();
		}
	}
	
	public void turnAndMoveRight() {
		pickBeeper();
		turnRight();
		move();
		turnRight();
		move();
	}
	
	public void turnAndMoveLeft() {
		pickBeeper();
		turnLeft();
		move();
		turnLeft();
		move();
	}
	
	public void go() {
		launch();
		turnAndMoveRight();
		launch();
		turnAndMoveLeft();
		launch();
		turnAndMoveRight();
		launch();
		turnAndMoveLeft();
		launch();
		pickBeeper();	
	}
	
	public static void main(String[] args) {
		World.setDelay(10);
		World.readWorld("replanterField.kwld");
		World.setVisible(true);
		
		RePlanter john = new RePlanter(2,3,North,infinity);
		john.go();
		john.move();
	}

}
