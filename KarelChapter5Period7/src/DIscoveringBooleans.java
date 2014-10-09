import kareltherobot.*;

public class DIscoveringBooleans {

	public static void main(String[] args) {
		int x = 0;
		boolean isWet = true;
		boolean isDry = false;
		
		if(isWet == true) {
			System.out.println("It is wet");
		} else {
			System.out.println("It is dry");
		}
 		
		if(x >= 0) {
			System.out.println("It is wet");
		} else if (x < 0){
			System.out.println("X is a non-negative");
		}

	}

}
