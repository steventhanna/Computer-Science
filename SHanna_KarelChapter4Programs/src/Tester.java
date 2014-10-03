import kareltherobot.*;

public class Tester extends Robot implements Directions{
	
	public Tester(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	private OneLayer john = new OneLayer(1,1,North,infinity);
	private OneLayer chaney = new OneLayer(1,4,North,infinity);
	private TwoLayer cobo = new TwoLayer(6,2,South,infinity);
	private TwoLayer goose = new TwoLayer(6,5,South,infinity);
	private ThreeLayer jose = new ThreeLayer(1,7,North,infinity);
	


	public void getToWork() {
		john.go();
		chaney.go();
		cobo.go();
		goose.go();
		jose.go();
	}
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setSize(10,10);
		World.setDelay(10);
		Tester josh = new Tester(1,1,North,0);
		josh.setVisible(false);
		josh.getToWork();
		
	}
	
}
