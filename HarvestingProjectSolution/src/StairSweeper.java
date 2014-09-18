import kareltherobot.*; 

public class StairSweeper extends UrRobot 
{
	// Constructor 
	public StairSweeper(int st, int ave, Direction direct, int beepers) 
	{
		// Calls the constructor from the superclass 
		super(st, ave, direct, beepers);
	}

	public void turnRight()
	{
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft(); 
		World.setDelay(15);
	}
	
	public void climbStair()
	{
		turnLeft(); 
		move(); 
		turnRight(); 
		move(); 
	}
	
	public static void main(String[] args) 
	{
		World.readWorld("stairWorldMuneebMade.kwld");
		World.setVisible(true); 
		World.setDelay(15);
		World.setSize(7,7); 
		
		StairSweeper jake = new StairSweeper(1, 1, East, infinity); 

		jake.climbStair(); 
		jake.pickBeeper();
		jake.climbStair(); 
		jake.pickBeeper(); 	
		jake.climbStair();
		jake.pickBeeper();
		jake.turnOff(); 
	}

}
