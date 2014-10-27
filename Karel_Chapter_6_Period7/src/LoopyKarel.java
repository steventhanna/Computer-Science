import kareltherobot.*;
 
public class LoopyKarel extends Robot {

	public LoopyKarel(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	public void turnRight() {
		for(int i=3; i>0; i--) {
			turnLeft();
		}
	}
	
	
	public void walkSquareOfLength(int amountPerSide) {
		for(int i=4; i>0; i--) {
			for(int x=amountPerSide; x>0; x--) {
				move();
				putBeeper();
			}
			turnLeft();
		}
	}
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(10);
		
		LoopyKarel eddie = new LoopyKarel(2,7,North,infinity);
		eddie.walkSquareOfLength(6);
		eddie.walkSquareOfLength(5);
		eddie.walkSquareOfLength(4);
		eddie.walkSquareOfLength(3);
		eddie.walkSquareOfLength(2);
		eddie.walkSquareOfLength(1);

	}

}
