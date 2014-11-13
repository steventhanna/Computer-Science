import kareltherobot.*;

public class OneLayer extends BeeperLayer {

	public OneLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	// Here is the override i am talking about.
	// I define dropBeeper(); as one super.putBeeper();.  
	// In other classes, I will define them as multiple putBeepers();
	@Override
	public void dropBeeper() {
		// TODO Auto-generated method stub
		super.putBeeper();
		
	}
	
	// Below is a loop... Just know it does whats inside the brackets 6 times.
	public void go() {
		for(int i=6; i>0; i--) {
			dropBeeper();
			move();
		}
	}
	
	
}
	