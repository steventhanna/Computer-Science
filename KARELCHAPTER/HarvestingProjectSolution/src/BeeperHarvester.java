import kareltherobot.*;

public class BeeperHarvester extends Harvester 
{

	// Constructor MEthod
	public BeeperHarvester(int st, int ave, Direction direction, int numOfBeepers) 
	{
		super(st, ave, direction, numOfBeepers); 
	}

	public void moveAndPick()
	{
		move();
		pickBeeper();
		pickBeeper(); 
	}
	
	/*
	public void pickBeeper()
	{
		super.pickBeeper();
		super.pickBeeper(); 
	}
	*/
	
}
