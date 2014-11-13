import kareltherobot.*; 

public class MileWalker extends UrRobot
{
	public MileWalker(int street, int avenue, Direction direction, int beepers)
	{
		super(street, avenue, direction, beepers); 
	}
	
	public void move()
	{
		super.move(); 
		super.move(); 
		super.move(); 
		super.move(); 
		super.move(); 
		super.move(); 
		super.move(); 
		super.move(); 
	}
}
