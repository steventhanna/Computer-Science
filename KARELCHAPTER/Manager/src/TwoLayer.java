import kareltherobot.*;

public class TwoLayer extends BeeperLayer {

	public TwoLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dropBeeper(int j) {
		for(int i=j; i>0; i--) {
			putBeeper();
			putBeeper();
			move();
		}
		
	}

	@Override
	public void go() {
		dropBeeper(2);
		putBeeper();
		putBeeper();
		turnLeft();
		move();
		turnLeft();
		dropBeeper(3);	
	}

}
