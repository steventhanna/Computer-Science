/**
* @author Steven Hanna
* @class Program3.java
* @date 2/9/15
* @description Reverse the user inputted integer
*/

import java.util.*;

public class Program3 {

	/**
	* This method reverses the given intger
	* @param integer to be reversed
	*/
	public static void reverse(int number) {
		String original = "" + number;
		String reversed = new StringBuilder(original).reverse().toString();
		System.out.print(reversed);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an inger: ");
		int number = scanner.nextInt();
		System.out.println("The reverse is: ");
		reverse(number);
		scanner.close();
	}
}
