import kareltherobot.*;

public class BeeperTester extends Harvester {

	public BeeperTester(int st, int ave, Direction direction, int numOfBeepers) {
		super(st, ave, direction, numOfBeepers);
	}

	public static void main(String[] args) {
		World.setVisible(true);
		
		Harvester bob = new Harvester(1,1,North,19);
		
		bob.putBeeperAmount(20);
		bob.move();

	}

}
