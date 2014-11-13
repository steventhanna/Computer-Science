import kareltherobot.Directions.Direction;


public class LongerHarvester extends Harvester {

	// Constructor Method
	public LongerHarvester(int st, int ave, Direction direction, int numOfBeepers) 
	{
		super(st, ave, direction, numOfBeepers); 
	}
	
	public void pickRow()
	{
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 	
		moveAndPick();
	}
}
