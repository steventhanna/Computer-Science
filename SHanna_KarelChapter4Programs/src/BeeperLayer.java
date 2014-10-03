import kareltherobot.*;

public abstract class BeeperLayer extends Robot {

	public BeeperLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	public abstract void dropBeeper();
	
	public void turnRight() {
		World.setDelay(0);
		for(int i=3; i>0; i--) {
			turnLeft();
		}
		World.setDelay(10);
	}

}
