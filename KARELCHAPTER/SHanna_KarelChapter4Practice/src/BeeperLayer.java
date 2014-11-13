import kareltherobot.*;

public abstract class BeeperLayer extends Robot {

	public BeeperLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	// Completely blank method. 
	public abstract void putBeepers();
	
	public void layBeepers() {
		for(int i=4; i>0; i--) {
			move();
			putBeepers();
		}
	}
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(10);
		
		// Var declaration
		
		BeeperLayer grant;
		grant = new TwoRowLayer(1,3,East,infinity);
		grant.layBeepers();
		
		grant = new ThreeRowLayer(2,1,East,infinity);
		grant.layBeepers();

		grant = new TwoRowLayer(3,3,East,infinity);
		grant.layBeepers();
		
		grant = new ThreeRowLayer(4,1,East,infinity);
		grant.layBeepers();
		
		grant = new TwoRowLayer(5,3,East,infinity);
		grant.layBeepers();
		
		grant = new ThreeRowLayer(6,1,East,infinity);
		grant.layBeepers();
		

	}

}
