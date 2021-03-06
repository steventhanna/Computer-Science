/**
 * Complete the following class with 
 * the necessary methods.
 * 
 * If a class implements an interface, then 
 * it must define or implements the 
 * blank methods in the interface. 
 */
import kareltherobot.*;

// Either I add unimplemented methods with an @override, 
// or I make the class abstract.  I must ask Eddie
public class Roofer extends UrRobot implements Worker 
{
	public Roofer(int street, int avenue, Direction direction, int numOfBeepers)
	{
		super(street, avenue, direction, numOfBeepers);
	}
	
	// helper method
	private void makeRoof()
	{
		makeLeftGable();
		makeTopBeeper();
		makeRightGable(); 
	}
	
	public void turnRight() {
		World.setDelay(0);
		for(int i=3; i>0; i--) {
			turnLeft();
		}
		World.setDelay(15);
	}
	
	// helper method
	private void makeLeftGable()
	{
		// complete the following method
		// make sure robot is facing east
		// should start at 5,1
		for(int i=6; i>0; i--) {
			putBeeper();
			turnLeft();
			move();
			turnRight();
			move();
		}
		
	}
	
	private void makeTopBeeper() {
		putBeeper();
	}
	// helper method
	private void makeRightGable()
	{
		// complete the following method
		// make sure robot is facing east
		// should start at 10,7
		for(int i=6; i>0; i--) {
			turnRight();
			move();
			turnLeft();
			move();
			putBeeper();
		}
		move();
	}

	@Override
	public void getToWork() {
		// TODO Auto-generated method stub
		makeRoof();
		setVisible(false);
		turnOff();
	}
}
