/**
* @author Steven Hanna
* @class Program2
* @date 2/9/15
* @description computes the sum of the digits in an integer
*/

import java.util.Scanner;

public class Program2 {

	/**
	* Computes the sum of the digits in an integer
	* @param integer n - will have digits added together
	* @return integer sum
	*/
	public static int sumDigits(int n) {
		int sum = 0;
		// Use % to get each digit seperate from the rest
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an inger: ");
		int number = scanner.nextInt();
		System.out.println("The sum of the digits is: " + sumDigits(number));
		scanner.close();
	}
}
