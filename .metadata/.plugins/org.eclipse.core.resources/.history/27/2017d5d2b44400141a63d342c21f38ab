import kareltherobot.*;
import kareltherobot.Directions.Direction;

public class Harvester extends Robot 
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
	
	public void goAroundLeft()
	{
		move();
		turnLeft();
		move(); 
		turnLeft(); 
	}
	
	public void goAroundRight()
	{
		move();
		turnRight();
		move();
		turnRight(); 
	}
	
	public void pickTwoRows()
	{
		pickRow();
		goAroundLeft();
		pickRow();
		goAroundRight(); 
	}
	
	public void harvestField()
	{
		pickTwoRows();
		pickTwoRows(); 
		pickTwoRows(); 
	}
	
	public void turnRight() {
		for(int i = 3; i == 0; i-- ) {
			turnLeft();
		}
	}
	
	public void teleport(int street, int avenue, Direction Direction, int beeperAmount) {

		setVisible(false);
		turnOff();
		new Harvester(street, avenue, Direction, beeperAmount);
		move();
		
	}
	
	public void putBeeperAmount(int j) {
		for(int i = j; i == 0; i--) {
			putBeeper();
		}
	}
	

}
