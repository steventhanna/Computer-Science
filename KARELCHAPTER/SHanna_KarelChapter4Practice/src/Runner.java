import kareltherobot.*;

public class Runner implements Directions {

	public static void main(String[] args) {
		
		World.setVisible(true);
		World.readWorld("fieldExampleWorld.kwld");
		World.setDelay(20);
		
		Harvester johnny = null;
		Harvester bob = null;
		// Known as declaring the var.  not really, but whatever
		johnny = new Harvester(2, 2, East, 0);
		// The jonny is the reference
		/*
		johnny.pickTwoRows();
		johnny.teleport(1, 1, East, 1);
		johnny.turnOff();
		
		
		johnny = new Harvester(4, 2, East, 0);
		johnny.pickTwoRows();
		johnny.turnOff();
		
		johnny = new Harvester(6,2,East, 0);
		johnny.pickTwoRows();
		johnny.turnOff();
		*/
		
		bob = new Harvester(1,1,North,10);
		bob.putBeeperAmount(2);
		bob.moveAmount(5);
		
		
	}

}