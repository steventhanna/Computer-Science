import kareltherobot.*;

public class Choreographer extends Robot {

	public Choreographer(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	// Declare fields - an initial value for a var
	// Also known as an instance variable
	// First Slave
	private Robot dianna = new Robot(4, 2, East, 0);
	// Second slave
	private Robot tri = new Robot(6, 2, East, 0);
	
	public void pickRow() {
		for(int i = 6; i>0; i--) {
			move();
			pickBeeper();
		}
	}
	
	public void turnAroundLeft() {
		for(int i = 2; i>0; i--) {
			move();
			turnLeft();
		}
	}
	
	public void turnAroundRight() {
		for(int i = 2; i>0; i--) {
			move();
			turnRight();
		}
	}
	
	public void turnRight() {
		World.setDelay(0);
		for(int i = 3; i>0; i--) {
			turnLeft();
		}
		World.setDelay(10);
	}
	
	public void pickTwoRows() {
		pickRow();
		turnAroundLeft();
		pickRow();
		turnAroundRight();
		
	}
	
	@Override
	public void move() {
		super.move();
		dianna.move();
		tri.move();
	}
	
	@Override
	public void pickBeeper() {
		super.pickBeeper();
		dianna.pickBeeper();
		tri.pickBeeper();
	}
	
	@Override
	public void turnLeft() {
		super.turnLeft();
		dianna.turnLeft();
		tri.turnLeft();
	}
	
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.readWorld("fieldExampleWorld.kwld");
		World.setDelay(10);
		
		Choreographer tim = new Choreographer(2, 2, East, 0);
		tim.pickTwoRows();
		
	}

}
