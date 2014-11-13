import kareltherobot.*;
import java.awt.Color;

public class ChangeColor extends Robot {

	
	public ChangeColor(int street, int avenue, Direction direction, int beepers, int color) {
		super(street, avenue, direction, beepers);
		beeperNumber = color;
		
	}

	private int beeperNumber = 0;
	
	public void moveAndPut() {
		putBeeper();
		move();
	}
	
	public void changeBeeperColor() {
		if(beeperNumber == 1) {
			World.setBeeperColor(Color.red);
			moveAndPut();
			beeperNumber = 2;
		} else if(beeperNumber == 2) {
			World.setBeeperColor(Color.orange);
			moveAndPut();
			beeperNumber = 3;
		} else if(beeperNumber == 3) {
			World.setBeeperColor(Color.yellow);
			moveAndPut();
			beeperNumber = 4;
		} else if(beeperNumber == 4) {
			World.setBeeperColor(Color.green);
			moveAndPut();
			beeperNumber = 5;
		} else if(beeperNumber == 5) {
			World.setBeeperColor(Color.blue);
			moveAndPut();
			beeperNumber = 6;
		} else if(beeperNumber == 6) {
			World.setBeeperColor(Color.magenta);
			moveAndPut();
			beeperNumber = 1;
		} else {
			beeperNumber = 1;
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		World.setDelay(10);
		World.setVisible(true);
		ChangeColor john = new ChangeColor(1,1,North,infinity, 0);
		for(int i=10; i>0; i--) {
			john.changeBeeperColor();
		}
	}
}
