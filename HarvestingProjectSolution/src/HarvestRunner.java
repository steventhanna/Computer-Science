import kareltherobot.*;

public class HarvestRunner implements Directions
{

	public static void main(String[] args) 
	{
		World.setVisible(true);
		World.setDelay(5);
		World.readWorld("fieldExampleWorld.kwld");
		
		Harvester ryan = new Harvester(2,2,East,0); 
		
		ryan.harvestField();
		ryan.turnOff(); 
		

	}

}
