import kareltherobot.*;

public class TwoLayer extends BeeperLayer {

	public TwoLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dropBeeper() {
		for(int i=2; i>0; i--) {
			putBeeper();
		}
		
	}
	
	// Start at 2,7,south
	public void go() {
		for(int i=5; i>0; i--) {
			dropBeeper();
			move();
		}
		dropBeeper();
		turnLeft();
		move();
		turnLeft();
		for(int i=6; i>0; i--) {
			dropBeeper();
			move();
		}
	}

}
