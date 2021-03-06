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

public class Mason extends BetterMethods implements Worker 
{
	public Mason(int street, int avenue, Direction direction, int numOfBeepers)
	{
		super(street, avenue, direction, numOfBeepers);
	}
	
	// helper method
	private void buildWall()
	{
		// complete the following method
		for(int i=5; i>0; i--) {
			putBeeper();
			move();
		}
	}

	@Override
	public void getToWork() {
		buildWall();
		setVisible(false);
		turnOff();
		
	}
	
}
