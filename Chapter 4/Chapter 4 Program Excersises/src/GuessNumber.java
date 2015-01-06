/*
 * Steven Hanna
 * 
 * Purpose: Write a program that generates a random number between 0 and 100, inclusive.
 * The program should prompt the user to guess the magic number and will let the user 
 * enter a guess. If the guess is not the magic number, the program should inform the 
 * user if their guess is too high or too low. The program should run until the user 
 * guesses the magic number.
 *
 */
import java.util.*;
import java.math.*;


public class GuessNumber {

	private static int randomNumber;
	private static int userNumber;

	public static void randomNumber() {
		Random randy = new Random();
		randomNumber = randy.nextInt(101);
	}

	public static void promptUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess the magic number");
		userNumber = scanner.nextInt();
	}

	public static boolean compareNumbers() {
		if(randomNumber == userNumber) {
			return false;
		} else {
			if(userNumber > randomNumber) {
				System.out.println("You guessed to high.");
			} else {
				System.out.println("You guessed to low.");
			}
			return true;
		}
	}

	public static void userGuesses() {
		while(compareNumbers()) {
			promptUser();
		}
		System.out.println("Good job");
	}

	public static void go() {
		randomNumber();
		userGuesses();
	}


	public static void main(String[] args) {
		go();
	}
}