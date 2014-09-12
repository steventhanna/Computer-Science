/* First program in Chapter 3 of Karel
 * Extending the robot language
 * 
 * We will be able to write new classes of robots 
 * with new methods
 * 
 * @author steventhanna
 */

import kareltherobot.*;

public class MileWalker extends Robot implements Directions {
	
	public MileWalker(int street, int avenue, Direction direction, int numberOfBeepers) {
		super(street, avenue, direction, numberOfBeepers);
	}
	
	public void moveMile() {
		move();
		move();
		move();
		move();
		move();
		move();
		move();
		move();
	}
	
	public static void main(String[] args) {
		World.setDelay(15);
		World.setVisible(true);
		World.setSize(30, 30);
		
		MileWalker phillip = new MileWalker(1,1,North,100);
		
		phillip.moveMile();
	}
	
}
