import kareltherobot.*;

public class TwoLayer extends BeeperLayer {

	public TwoLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void dropBeeper() {
		putBeeper();
		putBeeper();
	}
	
	public void twoRows() {
		layBeeper();
		turnRight();
		move();
		turnAround();
		move6();
		turnAround();
		layBeeper();
		move();
	}

	
	

}
