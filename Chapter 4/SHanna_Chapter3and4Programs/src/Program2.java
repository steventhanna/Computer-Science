/*
 * Steven Hanna
 * Program 2 - Program2.java
 * Purpose: Write a program that plays the popular rock-paper-scissor game. 
 * (Paper covers rock, rock beats scissor, and scissors cuts paper.) The 
 * program randomly generates a number 0, 1, or 2 representing scissor, 
 * rock, and paper. The program prompts the user to enter a number 0, 1, 
 * or 2 and displays a message indicating whether the user or the computer 
 * wins, loses, or draws. Here are sample runs:
 */

import java.util.*;

public class Program2 {

	private static int rock = 0;
	private static int paper = 1;
	private static int scissor = 2;
	private static int userNumber;
	private static int AI;
	private static int counter = 0;
	private static int userWins = 0;
	private static int AIWins = 0;
	
	public static void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your move: rock (0), paper (1), scissor (2) ");
		userNumber = scanner.nextInt();
		if((userNumber > 2) || (userNumber < 0)) {
			System.out.println("The number you entered was not 0, 1, or 2.  Please try again.");
			getUserInput();
		}
	}
	
	public static void generateAINumber() {
		Random random = new Random();
		AI = random.nextInt(3);
	}
	
	public static void compareAnswers() {
		if(userWin(userNumber, AI) == 2) {
			System.out.println("User wins");
			userWins++;
		} else if(userWin(userNumber, AI) == 1) {
			System.out.println("AI wins");
			AIWins++;
		} else {
			System.out.println("TIE");
		}
		if(AI == 0) {
			System.out.println("AI is rock");
		} else if(AI == 1) {
			System.out.println("AI is paper");
		} else {
			System.out.println("AI is scissor");
		}
		if(userNumber == 0) {
			System.out.println("User is rock");
		} else if(userNumber == 1) {
			System.out.println("User is paper");
		} else {
			System.out.println("User is scissor");
		}
		System.out.println("Total user wins: " + userWins);
		System.out.println("Total AI wins: " + AIWins);
		
		
		
	}
	
	public static int userWin(int user, int AI) {
		// 0 == tie
		// 1 == AI wins
		// 2 == user wins
		
		if(user == AI) {
			System.out.println("Tie");
			return 0;
		} else if((user == 0) && (AI == 2)) {
			return 1;
		} else if((AI == 0) && (user == 2)) {
			return 2;
		} else if(user > AI) {
			return 2;
		} else {
			return 1;
		}
	}
	 
	public static void go() {
		while((userWins < 2) && AIWins < 2) {
			getUserInput();
			generateAINumber();
			compareAnswers();
			counter++;
		}
		if(userWins == 2) {
			System.out.println("Game terminated.  User has won twice.");
		} else {
			System.out.println("Game terminated.  AI has won twice.");
		}


	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		go();

	}

}
