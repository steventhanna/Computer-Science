import kareltherobot.*;

public class CRobot extends Robot implements Directions {

	public CRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);

	}

	public static void main(String[] args) {
		World.setVisible(true);
		World.readWorld("Problem1.kwld");
		World.setDelay(20);
		
		CRobot ben = new CRobot(2,2,West,1);
		
		ben.rightMoveTwiceAndPick();
		ben.rightMoveTwiceAndPick();
		
		ben.turnLeft();
		ben.moveTwice();
		ben.putBeeperAndMove();
		ben.putBeeperAndMove();
		ben.putBeeperAndMove();
		ben.turnOff();

	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
		
	public void moveTwice() {
		move();
		move();
	}
	
	public void rightMoveTwiceAndPick() {
		turnRight();
		moveTwice();
		pickBeeper();
	}
	
	public void putBeeperAndMove() {
		putBeeper();
		move();
	}

}
