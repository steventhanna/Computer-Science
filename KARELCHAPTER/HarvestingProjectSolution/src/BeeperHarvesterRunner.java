import kareltherobot.*;

public class BeeperHarvesterRunner implements Directions
{

	public static void main(String [] args) 
	{	
		World.setVisible(true);
		World.setDelay(5);
		World.readWorld("harvestworld1.kwld");
		
		BeeperHarvester rachel = new BeeperHarvester(2, 2, East, 0);
		rachel.harvestField();
		rachel.turnOff();
	}
}
