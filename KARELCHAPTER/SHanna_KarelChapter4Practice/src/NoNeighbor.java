import kareltherobot.*;

public class NoNeighbor extends Robot implements BeeperPutter, Directions {

	public NoNeighbor(int street, int avenue, Direction direction, int number) {
		super(street, avenue, direction, number);
	}
	
	
	
	
	@Override
	public void distributeBeepers() {
		// TODO Auto-generated method stub
		putBeeper();
		move();
		
	}

}
