import kareltherobot.*;

public class ThreeLayer extends BeeperLayer  {

	public ThreeLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dropBeeper() {
		// TODO Auto-generated method stub
		for(int i=3; i>0; i--) {
			putBeeper();
		}	
	}
	public void dropAndGo(int j) {
		for(int i=j; i>0; i--) {
			dropBeeper();
			move();
		}
	}
	
	public void disposeBeeper(int j) {
		for(int i=j; i>0; i--) {
			super.putBeeper();
		}
	}
	
	public void go() {
		dropAndGo(6);
		turnRight();
		move();
		turnRight();
		move();
		dropAndGo(5);
		disposeBeeper(3);
		turnLeft();
		move();
		turnLeft();
		dropAndGo(6);
	}
		
}
