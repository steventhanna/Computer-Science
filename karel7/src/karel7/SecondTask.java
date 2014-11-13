/*
 * Steven Hanna
 * Computer Science Period 7
 * Second Task - gather beepers
 * 
*/

package karel7;
import java.awt.Color;
import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class SecondTask implements Directions {

	public static void main(String[] args) {
		// Initialize world
		World.readWorld("world2.kwld");
		World.setVisible(true);
		World.setSize(10, 10);
		// Set beeper color
		World.setBeeperColor(Color.BLUE);
		// Change robot speed
		World.setDelay(5);
		// Initialize robot
		UrRobot karel = new UrRobot(1, 1, East, 1000);
		// Move Robot
		karel.turnLeft();
		karel.move();
		karel.move();
		// 1
		karel.pickBeeper();
		// 2
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.pickBeeper();
		// 3
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		karel.pickBeeper();
		// 4
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		// 5
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		// 6
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		karel.pickBeeper();
		karel.pickBeeper();
		karel.turnOff();
				
	}

}
