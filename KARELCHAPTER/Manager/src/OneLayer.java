import kareltherobot.*;

public class OneLayer extends BeeperLayer {

	public OneLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dropBeeper(int j) {
		for(int i = j; i>0; i--)
			putBeeper();
	}
	
	public void go() {
		for(int i=3; i>0; i--) {
			dropBeeper(1);
			move();
		}
	}

}
