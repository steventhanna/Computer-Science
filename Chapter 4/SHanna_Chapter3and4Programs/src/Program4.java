/*
 * Steven Hanna
 * Program 4 - Program4.java
 * Purpose: Write a program that prompts 
 * the user to select from 4 different patterns
 * and displays the chosen pattern
 */

import java.util.*;

public class Program4 {

	private static int userSelection;

	public static void userInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a pattern: (1) (2) (3) (4)");
		userSelection = scanner.nextInt();
		if((userSelection < 1) || (userSelection > 4)) {
			System.out.println("Invalid choice.  Try again");
			userInput();
		}
	}

	public static void pattern1() {
		System.out.println("Pattern I");
		System.out.println("");
		
		for (int i=1; i <=6; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
		
		/* 
		for(int i=1; i<=6; i++) {
			System.out.println(i);
			for(int a = 1; a<=i; a++) {
				System.out.print(a + " ");
			}
		} */
	}
	
	public static void pattern2() {
		System.out.println("");
		System.out.println("");
		System.out.println("Pattern 2");
		System.out.println("");
		for(int i=6; i>0; i--) {
			for(int a=1; a<=i; a++) {
				System.out.print(a + " ");
			}
			System.out.println("");
		}
	}
	
	public static void pattern3() {
		System.out.println("");
		System.out.println("Pattern 3");
		
		for(int i=1; i<=6; i++) {
			int spaces = (6-i)*2;
			for(int a=spaces; a>0; a--) {
				System.out.print(" ");
			}
			for(int a=i; a>0; a--) {
				System.out.print(a + " ");
			}
			System.out.println("");
		}
		
	}
	
	public static void pattern4() {
		System.out.println("");
		System.out.println("Pattern 4");
		System.out.println("");
		for(int i=6; i>0; i--) {
			int spaces = (6-i)*2; 
			for(int a=spaces; a>0; a--) {
				System.out.print(" ");
			}
			for(int a=1; a<=i; a++) {
				System.out.print(a + " ");
			}

			System.out.println("");
		}
	}
	
	public static void go() {
		userInput();
		switch(userSelection) {
			case(1): 
				pattern1();
				break;
			case(2):
				pattern2();
				break;
			case(3):
				pattern3();
				break;
			case(4):
				pattern4();
				break;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pattern1();
		// pattern2();
		// pattern3();
		// pattern4();
		go();
	}

}
