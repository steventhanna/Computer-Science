import kareltherobot.*;

public class HarvestRunner implements Directions {

	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(25);
		World.readWorld("fieldExampleWorld.kwld");
		Harvester ted = new Harvester(2,3,North,0);
		ted.moveUntilObstruction();

	}

}
