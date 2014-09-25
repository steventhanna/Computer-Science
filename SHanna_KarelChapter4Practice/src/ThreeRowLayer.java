import kareltherobot.*;

public class ThreeRowLayer extends BeeperLayer {

	public ThreeRowLayer(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	@Override
	public void putBeepers() {
		for(int i=3; i>0; i--) {
			putBeeper();
		}
	}

}
