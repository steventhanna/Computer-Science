// Step backwards on move()

import kareltherobot.*;

public class BackwardWalker extends Robot implements Directions {

	public BackwardWalker(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	
	public void move() {
		World.setDelay(0);
		turnAround();
		super.move();
		turnAround();
		World.setDelay(15);
	}
	
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(15);
		
		BackwardWalker john = new BackwardWalker(2,2,North,9);
		john.move();
	}
}
