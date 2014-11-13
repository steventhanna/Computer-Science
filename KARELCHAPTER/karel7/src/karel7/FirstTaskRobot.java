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
import kareltherobot.Robot;
import kareltherobot.*;

public class FirstTaskRobot implements Directions {
	
	public static void main(String[] args) {
		// Initialize world
		World.readWorld("worldOne.kwld");
		World.setVisible(true);
		World.setSize(10, 10);
		// Set beeper color
		World.setBeeperColor(Color.BLUE);
		// Change robot speed
		World.setDelay(25);
		// Initialize robot
		Robot karel = new Robot(1, 1, East, 1000);
		while (karel.frontIsClear()) {
			if (karel.nextToABeeper()) {
				karel.pickBeeper();
			} else if (karel.frontIsClear() == false) {
				karel.turnLeft();
				karel.move();
			} else {
				karel.move();
			}
		}
	}



}
