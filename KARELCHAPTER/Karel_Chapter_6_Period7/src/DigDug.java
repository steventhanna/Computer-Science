import kareltherobot.*;

public class DigDug extends Robot {

	public DigDug(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}
	

	public void faceNorth() {
		while(!facingNorth()) {
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
	
	public void faceSouth() {
		while(!facingSouth()) {
			turnLeft();
		}
	}
	
	public void checkHole() {
		faceWest();
		
	}
	
}
