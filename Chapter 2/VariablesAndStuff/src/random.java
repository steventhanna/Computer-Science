/* 
 * Generate two random numbers between 1 and 50
 * Have the add them togehter
 * check if ture
 */

import java.util.*;

public class random {
	
	
	// Generate numbers using the random class.  
	public static int[] generateNumbers() {
		Random randy = new Random();
		int number1 = randy.nextInt(51);
		int number2 = randy.nextInt(51);
		// For organization, i stored them into an array
		int[] resultant = new int[2];
		resultant[0] = number1;
		resultant[1] = number2;
		return resultant;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// For more organization, another ray to get generateNumbers results
		int[] resultant = new int[2];
		resultant = generateNumbers();
		// Assign numbers 1 and 2 from array
		int number1 = resultant[0];
		int number2 = resultant[1];
		
		Scanner scanner = new Scanner(System.in);
		// Display the user with the numbers and collect info
		System.out.println("Add " + number1 + " + " + number2);
		int userAdd = scanner.nextInt();
		// Get actual addition
		int comAdd = number1 + number2;
		// Compare computer addition and user addition
		if(userAdd == comAdd) {
			System.out.println("Correct");
		} else {
			System.out.println("Not correct");
		}
		// Prevent memory leakage 
		scanner.close();
	}

}
