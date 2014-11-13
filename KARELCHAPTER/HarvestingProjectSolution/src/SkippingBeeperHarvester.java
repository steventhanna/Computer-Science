
public class SkippingBeeperHarvester extends Harvester
{

	public SkippingBeeperHarvester(int st, int ave, Direction direction, int numOfBeepers) 
	{
		super(st, ave, direction, numOfBeepers); 
	}

	public void moveAndPick()
	{
		move(); 
		pickBeeper();
		move(); 
	}
	
	public void pickBeeper()
	{
		super.pickBeeper();
		super.pickBeeper(); 
		super.pickBeeper(); 
	}
	
	public void turnAroundLeft()
	{
		move();
		turnLeft(); 
		move(); 
		turnLeft();
		move(); 
	}
	
	public void turnAroundRight()
	{
		move();
		turnRight(); 
		move(); 
		turnRight();
		move(); 
	}
}
