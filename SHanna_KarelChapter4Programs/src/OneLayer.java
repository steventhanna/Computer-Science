import kareltherobot.*;

public class OneLayer extends BeeperLayer {

	public OneLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void layerOne() {
		for(int i = 6; i>0; i--) {
			dropBeeper();
		}
	}

	@Override
	public void dropBeeper() {
		putBeeper();
		
	}
	
}
