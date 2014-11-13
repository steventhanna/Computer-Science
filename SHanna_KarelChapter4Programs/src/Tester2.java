import kareltherobot.*;

public class Tester2 extends Robot implements Directions{
	
	public Tester2(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	private ThreeLayer john = new ThreeLayer(1,1,North,infinity);
	private OneLayer chaney = new OneLayer(1,4,North,infinity);
	private OneLayer cobo = new OneLayer(1,5,North,infinity);
	private OneLayer goose = new OneLayer(1,6,North,infinity);
	private TwoLayer jose = new TwoLayer(6,7,South,infinity);
	private OneLayer roberto = new OneLayer(1,9,North,infinity);
	private OneLayer chang = new OneLayer(1,10,North,infinity);
	


	public void getToWork() {
		john.go();
		chaney.go();
		cobo.go();
		goose.go();
		jose.go();
		roberto.go();
		chang.go();
	}
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setSize(10,10);
		World.setDelay(10);
		Tester2 josh = new Tester2(1,1,North,0);
		josh.setVisible(false);
		josh.getToWork();
		
	}
	
}
