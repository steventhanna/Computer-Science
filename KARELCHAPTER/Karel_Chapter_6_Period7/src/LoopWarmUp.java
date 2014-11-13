import kareltherobot.*;

public class LoopWarmUp extends Robot {

	public LoopWarmUp(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public void climb(int stairAmount, int beepAmount) {
		for(int i=stairAmount; i>0; i--) {
			while(!facingNorth()) {
				turnLeft();
			}
			move();
			turnRight();
			move();
			for(int x=beepAmount; x>0; x--) {
				putBeeper();
			}
		}
	}
	
	public void climber(int height, int deep, int amount) {
		for(int i=amount; i>0; i--) {
			while(!facingNorth()) {
				turnLeft();
			}
			for(int x=height; x>0; x--) {
				move();
			}
			turnRight();
			for(int L=deep; L>0; L--) {
				move();
			}
		}
	}

	public void moveCounter(int lengthOfMotion) {
		System.out.println(lengthOfMotion);
		for(int i=0; i<lengthOfMotion; i++) {
			for(int j=0; j<i; j++) {
				putBeeper();
			}
			move();
		}
	}
	
	public static void main(String[] args) {
		World.setDelay(10);
		World.setVisible(true);
		
		LoopWarmUp john = new LoopWarmUp(1,1,North,infinity);
		LoopWarmUp jose = new LoopWarmUp(1,1,North,infinity);
		jose.moveCounter(20);
	}

}
