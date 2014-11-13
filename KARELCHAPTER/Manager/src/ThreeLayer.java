import kareltherobot.*;

public class ThreeLayer extends BeeperLayer {

	public ThreeLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dropBeeper(int j) {
		// TODO Auto-generated method stub
		for(int i=j; i>0; i--) {
			putBeeper();
			putBeeper();
			putBeeper();
			move();
		}
		
	}
	
	public void go() {
		dropBeeper(3);
		turnRight();
		move();
		turnRight();
		move();
		dropBeeper(2);
		turnLeft();
		putBeeper();
		putBeeper();
		putBeeper();
		move();
		turnLeft();
		dropBeeper(3);
		
	}

}
