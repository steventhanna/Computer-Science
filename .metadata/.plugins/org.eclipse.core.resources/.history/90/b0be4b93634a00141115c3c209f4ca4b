import kareltherobot.*;

public class ThreeLayer extends BeeperLayer  {

	public ThreeLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}
	
	public void dropBeeper() {
		for(int i=3; i>0; i--) {
			putBeeper();
		}
	}
	
	public void threeRows() {
		layBeeper();
		turnRight();
		move();
		turnRight();
		layBeeper();
		turnLeft();
		move();
		turnLeft();
		layBeeper();
		move();
	}
	
}
