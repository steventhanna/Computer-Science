/**
* @author Steven Hanna
* @class CreditCard
* @date 2/17/15
* @description determines the validity of a credit card number based on the 
* Luhn Check
* @note this program does not prompt the user to enter a credit card number.  
* Instead, creditcard numbers must be passed as an object. Then you can run the 
* primary method determineValidity(), which encapsulates several other methods
* into a final statement.
*/

public class CreditCard {

	private String card;
	private int[] cardNumbers;
	private String cardVendor;

	/**
	* Constructor for CreditCard
	* @param String cardNumber.  Primary input for users.
	*/
	public CreditCard(String cardNumber) {
		card = cardNumber;
	}

	/** 
	* Determines card vendor based on first two numbers of card
	*/
	public void cardVendor() {
		int firstNumber = convertStringToInt(card.substring(0,1));
		int secondNumber = convertStringToInt(card.substring(1,2));
		// System.out.print(firstNumber + " " + secondNumber);
		if(firstNumber == 4) {
			cardVendor = "VISA";
		} else if(firstNumber == 5) {
			cardVendor = "MASTER";
		} else if(firstNumber == 6) {
			cardVendor = "DISCOVER";
		} else if((firstNumber == 3) && (secondNumber == 7)) {
			cardVendor = "AMEX";
		} else {
			cardVendor = "UNKNOWN";
		}
	}

	/**
	* Transfers the string into an int[]
	*/
	public void assignCardToArray() {
		int length = card.length();
		cardNumbers = new int[length];
		for(int i = 0; i < length - 1; i++) {
			cardNumbers[i] = convertStringToInt(card.substring(i, i + 1));
		}
		// Accounts for an error somewhere
		cardNumbers[length - 1] = convertStringToInt(card.substring(length - 1));

	}

	/**
	* Performs the Luhn Check
	* @return boolean value based on the validity of card
	*/
	public boolean luhnCheck() {
		// double all numbers with even array id's
		for(int i = 0; i < cardNumbers.length; i++) {
			if(i % 2 == 0) {
				cardNumbers[i] *= 2;
				if(cardNumbers[i] > 9) {
					// add up the two digits
					cardNumbers[i] = sumDigits(cardNumbers[i]);
				}
			}
		}
		// Add up everything in array
		int sum = 0;
		for(int i = 0; i < cardNumbers.length; i++) {
			sum += cardNumbers[i];
		}
		if(sum % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	* Adds all of the digits in a given number
	* @param int n
	* @return sum of the digits of int n
	*/
	public int sumDigits(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	/**
	* Converts a string to an int
	* @param String s that is to be converted to an int
	* @return integer number that is the new version of the String
	*/
	public int convertStringToInt(String s) {
		int num = Integer.parseInt(s);
		return num;
	}
	
	/**
	* A container that runs all mandatory methods to determine card validity
	*/
	public void determineValidty() {
		cardVendor();
		assignCardToArray();
		System.out.print(cardVendor + " " + card + " is ");
		if(luhnCheck()) {
			System.out.print("valid");
		} else {
			System.out.print("invalid");
		}
	}

	public static void main(String[] args) {
		CreditCard card = new CreditCard("4388576018410707");
		card.determineValidty();
	}
}