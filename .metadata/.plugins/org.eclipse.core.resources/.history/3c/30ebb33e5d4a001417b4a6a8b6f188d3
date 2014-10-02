import kareltherobot.*;

public abstract class BeeperLayer extends Robot {

	public BeeperLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	public abstract void dropBeeper();
	
	public void layBeeper() {
		dropBeeper();
		super.move();
	}
	
	public void turnRight() {
		World.setDelay(0);
		for(int i=2; i>0; i--) {
			turnLeft();
		}
		World.setDelay(15);
	}
	
	
	public void move6() {
		for(int i=6; i>0; i--) {
			super.move();
		}
	}
	
	public void turnAround() {
		World.setDelay(0);
		for(int i=2; i>0; i--) {
			turnLeft();
		}
		World.setDelay(15);
	}

}
