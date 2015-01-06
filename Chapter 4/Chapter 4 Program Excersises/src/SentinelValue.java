/*
 * Steven Hanna
 * 
 * Purpose: Write a program that takes keeps adding the numbers entered by the user 
 * until the number 0 is input, then the program calculates and prints the sum of 
 * those values.
 */

import java.util.*;

public class SentinelValue {

	private static int userEnteredNumbers;

	public static void inputNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		if(number != 0) {
			userEnteredNumbers += number;
			inputNumbers();
		} else {
			System.out.println("The sum of the numbers entered is: " + userEnteredNumbers);	
		}
		
	}

	public static void main(String[] args) {
		inputNumbers();

	}

}
