import kareltherobot.*; 

public class BackWalker extends UrRobot
{
	public BackWalker(int street, int avenue, Direction direction, int beepers)
	{
		super(street, avenue, direction, beepers); 
	}
	
	public void move()
	{
		turnAround(); 
		super.move(); 
		turnAround(); 
	}
	
	private void turnAround()
	{
		World.setDelay(0);
		turnLeft(); 
		turnLeft(); 
		World.setDelay(20); 
	}
}
