/*
 * Steven Hanna
 * Computer Science Period 7
 * First Task - gather beepers and place m
 * 
*/

package karel7;

//Import statements
import java.awt.Color;
import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class FirstTask implements Directions {
	public static void main(String[] args) {
		// Initialize world
		World.readWorld("worldOne.kwld");
		World.setVisible(true);
		World.setSize(10, 10);
		// Set beeper color
		World.setBeeperColor(Color.BLUE);
		// Change robot speed
		World.setDelay(5);
		// Initialize robot
		UrRobot karel = new UrRobot(1, 1, East, 1000);
		// Move Robot
		// Go to 1,3
		karel.move();
		karel.move();
		// Turn left
		karel.turnLeft();
		// 4,3
		karel.move();
		karel.move();
		karel.move();
		karel.pickBeeper();
		// 8,3
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.pickBeeper();
		// 8,7
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.pickBeeper();
		// 5,8
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.pickBeeper();
		// 5,9
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		// 4,9
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		// End pick up
		// Begin Put down for H
		// First 4,9
		karel.putBeeper();
		// 3,9
		karel.move();
		karel.putBeeper();
		// 2,9
		karel.move();
		karel.putBeeper();
		// 2,7
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.putBeeper();
		// 3,7
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		// 4,7
		karel.move();
		karel.putBeeper();
		// Turn around
		karel.turnLeft();
		karel.turnLeft();
		// Move to center
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		// Move out of way
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		// On completion turn off
		karel.turnOff();
	}



}
