import kareltherobot.*;

public class CarpenterRunner extends Carpenter {

	public CarpenterRunner(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		World.setDelay(20);
		World.setVisible(true);
		World.readWorld("world3.kwld");
		
		CarpenterRunner karel = new CarpenterRunner(1,1,North,infinity);
		karel.carpet();
	}

}
