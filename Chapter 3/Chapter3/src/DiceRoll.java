import java.util.*;

public class DiceRoll {

	private static int roll;
	
	public static void generateRoll() {
		Random randy = new Random();
		roll = randy.nextInt(7);
		System.out.println("You rolled a " + roll);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateRoll();
		
		switch(roll) {
			case 1: 	
			case 2: 
				System.out.println("You lose");
				break;
			case 3: 
			case 4: 
			case 5:
				System.out.println("Please roll again");
				break;
			case 6: 
				System.out.println("You win");
				break;
		}

	}

}
