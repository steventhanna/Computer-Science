import kareltherobot.*;

public class SteepleRunner extends BeeperSteeple {

	public SteepleRunner(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World.setDelay(10);
		World.setVisible(true);
		World.readWorld("world2.kwld");
		
		SteepleRunner john = new SteepleRunner(1,1,North,infinity);
		
		john.pickAllBeepers();
	}

}
