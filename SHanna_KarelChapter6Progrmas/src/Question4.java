import kareltherobot.*;

public class Question4 extends Robot {

	public Question4(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	public static void main(String[] args) {
		World.setDelay(10);
		World.readWorld("question42.kwld");
		World.setVisible(true);
	}

}
