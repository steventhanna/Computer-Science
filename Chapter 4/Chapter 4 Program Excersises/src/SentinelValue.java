/*
 * Steven Hanna
 * 
 * Purpose: Write a program that takes keeps adding the numbers entered by the user 
 * until the number 0 is input, then the program calculates and prints the sum of 
 * those values.
 */

import java.util.*;

public class SentinelValue {

	private static int userEnteredNumbersSum;
	private static double userEnteredNumbersAverage;
	private static ArrayList<Integer> userEnteredNumbers = new ArrayList<Integer>();

	public static void inputNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		if(number != 0) {
			// userEnteredNumbers += number;
			userEnteredNumbers.add(number);
			inputNumbers();
		} else {
			calculateSum();
			calculateAverage();
			System.out.println("The sum of the numbers is: " + userEnteredNumbersSum);
			System.out.println("The average of the numbers is: " + userEnteredNumbersAverage);
		}
	}

	public static void calculateSum() {
		for(int i = 0; i<userEnteredNumbers.size(); i++) {
			userEnteredNumbersSum += userEnteredNumbers.get(i);
		}
	}
	
	public static void calculateAverage() {
		userEnteredNumbersAverage = userEnteredNumbersSum / userEnteredNumbers.size();
	}

	public static void main(String[] args) {
		inputNumbers();

	}

}
