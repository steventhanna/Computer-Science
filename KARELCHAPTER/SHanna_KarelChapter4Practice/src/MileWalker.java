import kareltherobot.*;

public class MileWalker extends Robot implements Directions {

	public MileWalker(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void move() {
		for(int i=8; i>0; i--) {
			super.move();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World.setVisible(true);
		World.setDelay(15);
		
		MileWalker andy = new MileWalker(1,1,North,1);
		andy.move();
	}

}
