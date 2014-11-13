import kareltherobot.*;

public class SkippingBeeperHarvesterRunner implements Directions
{

	public static void main(String [] args) 
	{	
		World.setVisible(true);
		World.setDelay(5);
		World.readWorld("harvestworld5.kwld");
		
		SkippingBeeperHarvester tri = new SkippingBeeperHarvester(2, 2, East, 0);
		tri.harvestField();
		tri.turnOff();
	}
}
