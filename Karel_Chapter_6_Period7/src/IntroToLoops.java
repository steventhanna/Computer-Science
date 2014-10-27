import kareltherobot.*;

public class IntroToLoops extends Robot {

	public IntroToLoops(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		
		
		for(int i = 1; i<=42; i = i*2) {
			System.out.println("Helo there: " + i);
		}
		
	}

}
