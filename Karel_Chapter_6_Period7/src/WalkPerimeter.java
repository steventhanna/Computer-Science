import kareltherobot.*;

public class WalkPerimeter extends Robot {

	public WalkPerimeter(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	public void walk() {
		
	}
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(10);
		World.readWorld("example5A.kwld");
		
		WalkPerimeter glad = new WalkPerimeter(1,1,North,infinity);

		
	}

}
