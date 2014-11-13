import kareltherobot.*;

public class NeighborRunner implements Directions
{
	public static void main(String[] args)
	{
		World.setVisible(true);
		World.setDelay(10);
		// BeeperPutter can be used as an overarching data-type.
		// Cannot use: new BeeperPutter();
		BeeperPutter aRobot = new NoNeighbor(1, 1, North, 1);
		aRobot = new NeighborTalker(1, 2, North, 1, aRobot);
		aRobot = new NeighborTalker(1, 3, North, 1, aRobot);
		aRobot = new NeighborTalker(1, 4, North, 1, aRobot);
		aRobot = new NeighborTalker(1, 5, North, 1, aRobot);	
	
		aRobot.distributeBeepers(); 
	}
}
