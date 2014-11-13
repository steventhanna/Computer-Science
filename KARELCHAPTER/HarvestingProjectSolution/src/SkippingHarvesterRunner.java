import kareltherobot.*;

public class SkippingHarvesterRunner implements Directions
{

	public static void main(String [] args) 
	{	
		World.setVisible(true);
		World.setDelay(5);
		World.readWorld("harvestworld4.kwld");
		
		SkippingHarvester mitch = new SkippingHarvester(2, 2, East, 0);
		mitch.harvestField();
		mitch.turnOff();
	}
}
