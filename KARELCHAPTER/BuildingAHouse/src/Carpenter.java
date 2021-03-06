/**
 * Complete the following class with 
 * the necessary methods.
 * 
 * If a class implements an interface, then 
 * it must define or implements the 
 * blank methods in the interface. 
 */
import kareltherobot.*;

//Either I add unimplemented methods with an @override, 
//or I make the class abstract.  I must ask Eddie

public class Carpenter extends BetterMethods implements Worker 
{
	public Carpenter(int street, int avenue, Direction direction, int numOfBeepers)
	{
		super(street, avenue, direction, numOfBeepers);
	}
	
	// helper method
	public void makeWindow()
	{
		// complete the following method
		putBeeper();
		for(int i=3; i>0; i--) {
			move();
			putBeeper();
			turnLeft();
		}
		destroy();
	}
	
	// helper method
	public void makeDoor()
	{
		// complete the following method
		for(int i=2; i>0; i--) {
			putBeeper();
			move();
		}
		turnRight();
		for(int i=2; i>0; i--) {
			putBeeper();
			move();
		}
		turnRight();
		for(int i=2; i>0; i--) {
			putBeeper();
			move();
		}
		putBeeper();
		setVisible(false);
		turnOff();
	}
	
	public void turnAround() {
		for(int i=2; i>0; i--) {
			turnLeft();
		}
	}

	@Override
	public void getToWork() {
		// TODO Auto-generated method stub
		// What do I put here?
		
	}

	
	
}
