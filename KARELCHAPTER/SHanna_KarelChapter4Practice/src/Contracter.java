import kareltherobot.*;

public class Contracter extends Robot {

	public Contracter(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	private mason;
	private roofer;
	private carpenter;
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(10);

	}

}
