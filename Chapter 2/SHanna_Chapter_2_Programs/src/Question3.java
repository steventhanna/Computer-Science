/*
 * Steven Hanna
 * Chapter 2: Program 3
 * Objective: Create a program that takes an integer
 * value between 0 and 1000 from the user and adds all
 * the digits in the integer. For example, if an integer
 * is 932, the sum of all its digits is 14.
 */


public class Question3 extends HelpfulMethods {

	private static String number;
	
	public static boolean inputAndCheck() {
		number = inputString("Input a number between 0 and 1000");
		int intNumber = Integer.parseInt(number);
		if((intNumber > 0) && (intNumber < 1000)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void calculate() {
		if(inputAndCheck()) {
			System.out.println(number.length());
			int[] calculateArray = new int[number.length()];
			for(int i = 0; i>number.length(); i++) {
				calculateArray[i] = number.substring(i);
			}
		}
	}
	
	public static void add(int number) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inputInt("Input a number between 0 and 1000");
		calculate();
		
		

	}

}
