import kareltherobot.*;

public abstract class BeeperLayer extends Robot {

	public BeeperLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	// Completly blank method. 
	public abstract void putBeepers();
	
	public void layBeepers() {
		for(int i = 4; i == 0; i-- ) {
			move();
			putBeepers();
		}
	}

}
