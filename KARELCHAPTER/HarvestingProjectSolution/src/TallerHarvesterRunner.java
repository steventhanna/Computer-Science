import kareltherobot.*;

public class TallerHarvesterRunner implements Directions
{

	public static void main(String [] args) 
	{	
		World.setVisible(true);
		World.setDelay(5);
		World.readWorld("harvestworld3.kwld");
		
		TallerHarvester andy = new TallerHarvester(2, 2, East, 0);
		andy.harvestField();
		andy.turnOff();
	}
}
