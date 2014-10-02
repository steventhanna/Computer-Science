import kareltherobot.*;

public class NeighborTalker extends UrRobot implements BeeperPutter
{
	private BeeperPutter neighbor = null; 
	
	public NeighborTalker(int st, int ave, Direction d, int num, BeeperPutter aRobot)
	{
		super(st, ave, d, num); 
		neighbor = aRobot; 
	}
	
	public void distributeBeepers()
	{
		putBeeper();
		move(); 
		neighbor.distributeBeepers(); 
	}
}
