public class SkippingHarvester extends Harvester
{

	public SkippingHarvester(int st, int ave, Direction direction, int numOfBeepers) 
	{
		super(st, ave, direction, numOfBeepers); 
	}
	
	public void turnAroundLeft()
	{
		move();
		turnLeft(); 
		move(); 
		move(); 
		turnLeft(); 
	}
	
	public void turnAroundRight()
	{
		move();
		turnRight();
		move();
		move(); 
		turnRight(); 
	}
	
	
}
