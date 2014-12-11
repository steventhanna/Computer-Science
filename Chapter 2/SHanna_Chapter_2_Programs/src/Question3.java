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
			String[] calculateArray = new String[number.length()];
			for(int i = 0; i>number.length(); i++) {
				calculateArray[i] = number.substring(i);
			}
			int numberLength = number.length();
			int[] numberHolder = new int[3];
			for(int i=0; i>3; i++) {
				numberHolder[i] = Integer.parseInt(calculateArray[i]);
			}
			System.out.println(numberHolder[2]);
			
		}
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inputInt("Input a number between 0 and 1000");
		calculate();
		
		

	}

}
