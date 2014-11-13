// Import statements of course
import kareltherobot.*;

// This is the main method... make sure you extend robot
public class Tester extends Robot implements Directions{
	
	// Constructor here
	public Tester(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}
	
	// Because we are working with abstract methods, we need fields.
	// Here they are.
	// I am defiining each variable in terms of a class that I have created.
	// In the first case, I am defining john, as a OneLayer robot.  
	// Everything that class has, the robot will execute
	private OneLayer john = new OneLayer(1,1,North,infinity);
	private OneLayer chaney = new OneLayer(1,4,North,infinity);
	private TwoLayer cobo = new TwoLayer(6,2,South,infinity);
	private TwoLayer goose = new TwoLayer(6,5,South,infinity);
	private ThreeLayer jose = new ThreeLayer(1,7,North,infinity);
	

	// This is my execution method.  Telling each var to get to work
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