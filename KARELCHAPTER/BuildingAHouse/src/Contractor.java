
import kareltherobot.*;

public class Contractor extends BetterMethods implements Directions
{
	// Create three helper robots
	// (1) Mason (2) Roofer (3) Carpenter
	// These are your fields AKA
	// instance variables 
	private Mason kenMason = new Mason(1,2,North,infinity);
	private Mason johnMason = new Mason(1,12,North,infinity);
	private Roofer sueRoofer = new Roofer(5,1,East,infinity);
	private Carpenter windowMakerOne = new Carpenter(5,10,North,infinity);
	private Carpenter windowMakerTwo = new Carpenter(5,5,North,infinity);
	private Carpenter doorMaker = new Carpenter(1,6,North,infinity);
	
	
	public Contractor(int street, int avenue, Direction direction, int numOfBeepers)
	{
		super(street, avenue, direction, numOfBeepers);
	}
	
	// helper method
	private void gatherTeam()
	{
		// messages for initial 
		
		// positioning of the team
	}
	
	public void buildHouse()
	{
		gatherTeam(); 
		// Tell mason to getToWork(); 
		kenMason.getToWork();
		johnMason.getToWork();
		// Tell roofer to getToWork();
		sueRoofer.getToWork();
		// Tell carpenter to getToWork();
		// lidnaCarpenter.getToWork();
		doorMaker.makeDoor();
		windowMakerOne.makeWindow();
		windowMakerTwo.makeWindow();
	}
	
	// You should not change the main method
	// This method must remain unchanged 
	public static void main(String[] args)
	{
		World.setVisible(true);
		World.setSize(15,15);
		World.setDelay(15);
		Contractor kristin = new Contractor(1, 1, East, 0);
		kristin.setVisible(false);
		kristin.buildHouse(); 
		kristin.turnOff(); 
	}
	
	
}
