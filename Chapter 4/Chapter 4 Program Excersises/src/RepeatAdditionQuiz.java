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

	private int[] randomNumbers = new int[3];
	
	public void generateRandomNumbers() {
		Random randy = new Random();
		randomNumbers[0] = randy.nextInt(10);
		randomNumbers[1] = randy.nextInt(10);
		randomNumbers[2] = randomNumbers[0] + randomNumbers[1];
	}
	
	public void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(randomNumbers[0]);
		System.out.println(randomNumbers[1]);
		System.out.println("Add the above numbers");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
