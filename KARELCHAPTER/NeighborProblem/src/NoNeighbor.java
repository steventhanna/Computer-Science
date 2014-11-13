import kareltherobot.*; 

public class NoNeighbor extends UrRobot implements BeeperPutter
{
	public NoNeighbor(int st, int ave, Direction d, int n)
	{
		super(st, ave, d, n);
	}
	
	public void distributeBeepers()
	{
		putBeeper(); 
		move(); 
	}
}