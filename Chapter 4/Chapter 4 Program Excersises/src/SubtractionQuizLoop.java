/*
 * Steven Hanna
 * 
 * Purpose: Write a program that generates two single digit numbers and
 * prompts the users to find their difference and the program lets the 
 * user know if they are right or wrong. If their answer is wrong, the 
 * program should let the user know what the correct answer is. The program
 * should also let the user know how long it took the user to answer the question.
 * (Use System.currentTimeMillis() to get the current time in milliseconds)
 *
 */

import java.util.*;



public class SubtractionQuizLoop {

	private static int[] numbers = new int[3];
	private static int userNumber;
	private static double[] timeElapsed = new double[3];

	public static void generateRandomNumbers() {
		Random randy = new Random();
		numbers[0] = randy.nextInt(10);
		numbers[1] = randy.nextInt(10);
		numbers[2] = numbers[1] - numbers[0];
	}

	public static void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		// Start clock
		timeElapsed[0] = System.currentTimeMillis();
		System.out.println("Subtract the following: \n " + numbers[0] + " and " + numbers[1]);
		userNumber = scanner.nextInt();
		timeElapsed[1] = System.currentTimeMillis();
		// Time elapsed = timeElapsed[2]
		timeElapsed[2] = timeElapsed[1] - timeElapsed[0];
	}

	public static boolean comparison() {
		if(userNumber != numbers[2]) {
			return false;
		} else {
			return true;
		}
	}

	public static void go() {
		generateRandomNumbers();
		getUserInput();
		if(comparison()) {
			System.out.println("You are correct!");
			System.out.println("It took you " + timeElapsed[2] + " milliseconds to answer the question");
		} else {
			System.out.println("The correct answer is " + numbers[2]);
			System.out.println("It took you " + timeElapsed[2] + " milliseconds to answer the question");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		go();

	}

}
