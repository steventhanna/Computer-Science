/*
 * Steven Hanna
 * Chapter 2: Helpful Methods
 * Objective: Create a series of helpful methods for use
 * in other programs
 */

import java.util.*;

public class HelpfulMethods {
	
	public static String inputString(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		String result = scanner.nextLine();
		return result;
	}
	
	public static int inputInt(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		int result = scanner.nextInt();
		return result;
	}
	
	public static double inputDouble(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		double result = scanner.nextDouble();
		return result;
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
	
	
}
