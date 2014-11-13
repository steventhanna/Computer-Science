import kareltherobot.*;

public class Question1 extends Robot {

	public Question1(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
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
	
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	
	public void goToEdge() {
		while(nextToABeeper()) {
			move();
		}
		if(!nextToABeeper()) {
			turnAround();
			move();
			turnAround();
		}
	}
	
	public void moving() {
		while(nextToABeeper()) {
			move();
		}
		if(!nextToABeeper()) {
			turnLeft();
		}
		moving();
	}
	
	public void go() {
		goToEdge();
		turnLeft();
		moving();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World.setDelay(15);
		World.readWorld("question1.kwld");
		World.setVisible(true);
		
		Question1 mark = new Question1(5,5,East,infinity);
		mark.go();
		
	}

}
