package karel;
// Import Statements
import kareltherobot.*;

public class Tester {
	
	
	// Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize world
		World.setVisible(true);
		
		// Initialize robot
		UrRobot Karel = new UrRobot(1, 1, North, 1);
		// Move robot
		Karel.move();
		Karel.move();
	}

}
