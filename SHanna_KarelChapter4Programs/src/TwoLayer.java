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

}
