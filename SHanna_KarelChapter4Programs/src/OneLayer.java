import kareltherobot.*;

public class OneLayer extends BeeperLayer {

	public OneLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	@Override
	public void dropBeeper() {
		// TODO Auto-generated method stub
		super.putBeeper();
		
	}
	
	public void go() {
		for(int i=6; i>0; i--) {
			dropBeeper();
			move();
		}
	}
	
	
}
	