import kareltherobot.*;

public class BetterMethods extends Robot implements Directions {

	public BetterMethods(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}
	
	public void moveAmount(int amount) {
		for(int i=amount; i>0; i--) {
			super.move();
		}
	}
	
	public void turnRight() {
		World.setDelay(0);
		for(int i=3; i>0; i--) {
			turnLeft();
		}
		World.setDelay(15);
	}
	
	public void destroy() {
		setVisible(false);
		turnOff();
	}
}
