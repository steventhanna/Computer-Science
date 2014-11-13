import kareltherobot.*;

public abstract class BeeperLayer extends Robot implements Directions {

	public BeeperLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	public abstract void dropBeeper(int j);
	
	public abstract void go();
	
	public void turnRight() {
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(10);
	}
}
