import kareltherobot.*;

public class SteepleChaser extends Hurdler {


	public SteepleChaser(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}
	
	

	public static void main(String[] args) {
		World.readWorld("world1.kwld");
		World.setDelay(10);
		World.setVisible(true);
		
		SteepleChaser john = new SteepleChaser(1,1,North,infinity);
		john.checkForWall();
	}

}
