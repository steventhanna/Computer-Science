/*
 * Steven Hanna
 * Chapter 6, Question 6
 * Purpose: follow a given map of on the program
 */
import kareltherobot.*;

public class Question6 extends Robot {

	public Question6(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	private int beeperAmount;

	public boolean noBeeper() {
		if(!nextToABeeper()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean nextToABeeperAmount() {
		if(!nextToABeeper()) {
			beeperAmount = 0;
			return false;
			
		} else {
			World.setDelay(0);
			while(nextToABeeper()) {
				pickBeeper();
				beeperAmount++;
			}
			World.setDelay(10);
		}
		return true;
	}
	
	public void faceNorth() {
		while(!facingNorth()) {
			turnLeft();
		}
	}

	public void faceSouth() {
		while(!facingSouth()) {
			turnLeft();
		}
	}
	
	public void faceEast() {
		while(!facingEast()) {
			turnLeft();
		}
	}
	
	public void faceWest() {
		while(!facingWest()) {
			turnLeft();
		}
	}
	
	public void go() {
		while(noBeeper()) {
			move();
		}
		if(nextToABeeper()) {
			nextToABeeperAmount();
			if(beeperAmount == 1) {
				faceNorth();
				beeperAmount = 0;
				go();
			}
			if(beeperAmount == 2) {
				faceWest();
				beeperAmount = 0;
				go();
			}
			if(beeperAmount == 3) {
				faceSouth();
				beeperAmount = 0;
				go();
			}
			if(beeperAmount == 4) {
				faceEast();
				beeperAmount = 0;
				go();
			}
			if(beeperAmount == 5) {
				turnOff();
				beeperAmount = 0;
			}
		}
	}
	
	
	public static void main(String[] args) {
		World.setDelay(10);
		World.readWorld("world6.kwld");
		World.setVisible(true);
		
		Question6 joe = new Question6(2,2,North,infinity);
		joe.go();
		

	}

}
