

public class Harvester extends MileWalker 
{
	// Constructor Method
	public Harvester(int st, int ave, Direction direction, int numOfBeepers) 
	{
		super(st, ave, direction, numOfBeepers); 
	}
	
	public void moveAndPick() 
	{
		move(); 
		pickBeeper(); 
	}
	
	public void pickRow()
	{
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 	
	}
	
	public void turnAroundLeft()
	{
		move();
		turnLeft(); 
		move(); 
		turnLeft(); 
	}
	
	public void turnAroundRight()
	{
		move();
		turnRight();
		move();
		turnRight(); 
	}
	
	public void pickTwoRows()
	{
		pickRow();
		turnAroundLeft();
		pickRow();
		turnAroundRight();
	}
	
	public void harvestField()
	{
		pickTwoRows();
		pickTwoRows();
		pickTwoRows(); 
	}
	
	

}
