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
		
}
