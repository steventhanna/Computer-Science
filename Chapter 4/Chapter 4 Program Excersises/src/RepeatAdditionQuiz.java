/*
 * Steven Hanna
 * 
 * Purpose: Write a program that generates two random single digit integers and asks the 
 * user to calculate their sum. This program should allow the user to enter the answer 
 * until they get it right.
 */

import java.util.*;
import java.math.*;

public class RepeatAdditionQuiz {

	private static int[] randomNumbers = new int[3];
	private static int userSum;
	
	public static void generateRandomNumbers() {
		Random randy = new Random();
		randomNumbers[0] = randy.nextInt(10);
		randomNumbers[1] = randy.nextInt(10);
		randomNumbers[2] = randomNumbers[0] + randomNumbers[1];
	}

	// Implement keep asking questions until five are correct
	private static int questionCounter;

	public static boolean fiveQuestionComplete() {
		if(questionCounter == 5) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(randomNumbers[0]);
		System.out.println(randomNumbers[1]);
		System.out.println("Add the above numbers");
		userSum = scanner.nextInt();
	}

	public static boolean checkSums() {
		if(userSum == randomNumbers[2]) {
			System.out.println("Correct!");
			return true;
		} else {
			System.out.println("Incorrect.");
			return false;
		}
	}

	// Call this method when inital input fails
	public static void getSecondaryInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Try to add the numbers again");
		userSum = scanner.nextInt();
	}

	public static boolean differentCheck() {
		while(userSum != randomNumbers[2]) {
			getSecondaryInput();
			differentCheck();
			return false;
		}
		System.out.println("Correct");
		questionCounter++;
		System.out.println("Amount of questions answered correctly: " + questionCounter);
		return true;
	}

	public static void go() {
		while(fiveQuestionComplete()) {
			// Randomize numbers
			generateRandomNumbers();
			// Ask user to calculate sum
			getInput();
			if(!checkSums()) {
				getSecondaryInput();
				differentCheck();
			} else {
				System.out.println("Correct");
				questionCounter++;
				System.out.println("Amount of questions answered correctly: " + questionCounter);
			}
			continueQuestions();
		}
	}

	public static void continueQuestions() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to continue solving questions?");
		System.out.println("Yes: 1, No: 0");
		int response = scanner.nextInt();
		// Use some cases here
		System.out.println("");		// Need a break here for spacing
		if(response == 1) {
			go();
		} else if((response > 1) && (response < 0)) {
			System.out.println("You did not enter either 1 or 0 ... Shame on you");
			continueQuestions();
		} else {
			System.out.println("Done");
		}
	}



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		go();
	}

}
