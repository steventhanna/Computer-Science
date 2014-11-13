 
import kareltherobot.*;

public class TwoRowLayer extends BeeperLayer {

	public TwoRowLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	@Override
	public void putBeepers() {
		putBeepers();
		putBeepers();
		
	}

}
