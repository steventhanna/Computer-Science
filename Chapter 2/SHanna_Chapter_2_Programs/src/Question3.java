/*
 * Steven Hanna
 * Chapter 2: Program 3
 * Objective: Create a program that takes an integer
 * value between 0 and 1000 from the user and adds all
 * the digits in the integer. For example, if an integer
 * is 932, the sum of all its digits is 14.
 */


public class Question3 extends HelpfulMethods {

	private static int number;
	
	public static void inputAndCheck() {
		number = inputInt("Input a number between 0 and 1000");
		if((number > 0) && (number < 1000)) {
			return;
		} else {
			inputAndCheck();
		}
	}
	
	public static void calculate() {
		inputAndCheck();
		int number1, number2, number3, number4, numberINT; 
		numberINT = number / 10;
		number2 = numberINT % 10;
		number3 = number % 10;
		number1 = numberINT / 10;
		System.out.println(number1 + " " + number2 + " " + number3);
		int total = number1 + number2 + number3;
		System.out.println("Total is: " + total);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inputInt("Input a number between 0 and 1000");
		calculate();
		

	}

}
