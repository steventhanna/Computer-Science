import kareltherobot.*; 

public class Knight extends UrRobot
{
	public Knight(int street, int avenue, Direction direction, int beepers)
	{
		super(street, avenue, direction, beepers); 
	}
	
	public void move()
	{
		super.move(); 
		super.move(); 
		super.move(); 
		turnRight(); 
		super.move(); 
	}
	
	private void turnRight()
	{
		World.setDelay(0); 
		turnLeft();
		turnLeft();
		turnLeft(); 
		World.setDelay(20);
	}

}
