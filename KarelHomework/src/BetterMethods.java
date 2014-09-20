import kareltherobot.*;

public class BetterMethods extends Robot implements Directions {

	public BetterMethods(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void turnRight() {
		World.setDelay(0);
		for(int i=3; i>0; i-- ) {
			turnLeft();
		}
		World.setDelay(25);
	} 
	
	public void turnAround() {
		World.setDelay(0);
		turnRight();
		turnRight();
		World.setDelay(25);
	}
	
}
