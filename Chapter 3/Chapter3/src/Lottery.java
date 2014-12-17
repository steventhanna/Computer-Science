import java.util.*;
public class Lottery {

	private static int userNumber;
	private static int userInput;
	
	public static void generateUserNumber() {
		Random randy = new Random();
	userNumber = randy.nextInt(100);
		if(userNumber < 10) {
			generateUserNumber();
		}
	}
	
	public static void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your lottery number");
		userInput = scanner.nextInt();
		if(userInput < 10) {
			System.out.println("Enter a larger number.");
			getUserInput();
		} else if(userInput > 99) {
			System.out.println("Enter a smaller number");
			getUserInput();
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateUserNumber();
		getUserInput();
		
		int lotteryDigitOne = userNumber / 10; // tens place number
		int lotteryDigitTwo = userNumber % 10; // ones place number
		
		int userDigitOne = userInput / 10; // tens place number
		int userDigitTwo = userInput % 10; // ones place number
		
		if(userInput == userNumber) {
			System.out.println("Exact match: you win $10,000");
		} else if((userDigitOne == lotteryDigitTwo) && (userDigitTwo == lotteryDigitOne)) {
			System.out.println("Matched all digits: you win $3,000");
		} else if((userDigitOne == lotteryDigitOne) || (lotteryDigitOne == userDigitTwo) || (lotteryDigitTwo == userDigitOne) || (lotteryDigitTwo == userDigitTwo)) {
			System.out.println("Matched one digit: you win $1,000");
		} else {
			System.out.println("Sorry, no match.  Please play again!");
		}
	}
}
