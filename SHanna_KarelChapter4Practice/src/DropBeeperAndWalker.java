import kareltherobot.*;

public class DropBeeperAndWalker extends Robot implements Directions{

	public DropBeeperAndWalker(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	public void move() {
		putBeeper();
		super.move();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World.setVisible(true);
		World.setDelay(15);
		
		DropBeeperAndWalker andy = new DropBeeperAndWalker(1,1,North,1);
		andy.move();
	}

}
