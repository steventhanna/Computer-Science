/** 
 * Chapter 3 Karel: Extending the Programming Language
 * 
 * We will write new classes of robots with new methods. 
 * 
 * @author Eddie
 *
 */

import kareltherobot.*; 

public class MileWalker extends UrRobot 
{
	// Constructor Method
	// Constructor must have EXACT same name as class
	public MileWalker(int street, int avenue, Direction direction, int numOfBeepers)
	{
		super(street, avenue, direction, numOfBeepers); 
		// super calls the superclass' constructor 
	}

	
	public void turnRight()
	{
		World.setDelay(0); 
		turnLeft();
		turnLeft(); 
		turnLeft();
		World.setDelay(5);
	}
	
	
	public static void main(String[] args) 
	{
		World.setVisible(true);
		World.setDelay(15); 
		World.setSize(10, 10);
		
		MileWalker bob = new MileWalker(4,3,East,infinity);
		
		bob.move();
		bob.turnLeft(); 
		bob.move(); 
		
		

	}

}
