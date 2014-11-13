/*
 * Steven Hanna
 * Computer Science Period 7
 * Third Task - gather beepers
 * 
*/

package karel7;
import java.awt.Color;
import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;
import kareltherobot.Robot;


public class ThirdTask implements Directions {

	public static void main(String[] args) {
		// Initialize world
		World.readWorld("world3.kwld");
		World.setVisible(true);
		World.setSize(10, 10);
		// Set beeper color
		World.setBeeperColor(Color.BLUE);
		// Change robot speed
		World.setDelay(5);
		
		// Init first robot
		UrRobot steve = new UrRobot(4, 2, North, 1000);
		UrRobot andy = new UrRobot(3, 7, North, 1000);
		// Pick up first beeper
		steve.pickBeeper();
		andy.pickBeeper();
		
		// steve move 1 and pick
		steve.move();
		steve.pickBeeper();
		
		// andy move 1 and pick
		andy.move();
		andy.turnLeft();
		andy.move();
		andy.pickBeeper();
		
		// steve move 2
		steve.move();
		steve.pickBeeper();
		
		// Andy move 2
		andy.turnLeft();
		andy.turnLeft();
		andy.move();
		andy.turnLeft();
		andy.move();
		andy.pickBeeper();
		
		// Steve move 3
		steve.turnLeft();
		steve.turnLeft();
		steve.turnLeft();
		steve.move();
		steve.pickBeeper();
		
		// andy move 3
		andy.move();
		andy.turnLeft();
		andy.move();
		andy.pickBeeper();
		
		// Steve finish
		steve.turnLeft();
		steve.turnLeft();
		steve.turnLeft();
		steve.move();
		steve.pickBeeper();
		steve.move();
		steve.pickBeeper();
		
		// turn off
		steve.turnOff();
		andy.turnOff();
		
		
		
		
	}

}
