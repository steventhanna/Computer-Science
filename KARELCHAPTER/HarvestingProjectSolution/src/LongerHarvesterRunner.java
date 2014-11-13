import kareltherobot.*;

public class LongerHarvesterRunner implements Directions
{

	public static void main(String [] args) 
	{	
		World.setVisible(true);
		World.setDelay(5);
		World.readWorld("harvestworld2.kwld");
		
		LongerHarvester damien = new LongerHarvester(2, 2, East, 0);
		damien.harvestField();
		damien.turnOff();
	}
}
