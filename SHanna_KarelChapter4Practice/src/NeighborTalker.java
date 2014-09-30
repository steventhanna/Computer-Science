import kareltherobot.*;

public class NeighborTalker extends Robot implements BeeperPutter, Directions {

	// field or instance var
	private BeeperPutter neighbor;


	public NeighborTalker(int street, int avenue, Direction direction,
			int beepers, BeeperPutter aRobot) {
		super(street, avenue, direction, beepers);
		neighbor = aRobot;
		
	}
	
	@Override
	public void distributeBeepers() {
		
	}
	
	

}
