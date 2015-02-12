
public class CreditCard {

	private String cardNumber;
	private int[] seperatedNumber;
	private String cardType;

	// Create constructor
	public CreditCard(String number) {
		// Assign number to cardNumber
		cardNumber = number;
	}

	// Seperate card number from string into array
	public void seperateDigitsFromString() {
		int length = cardNumber.length();
		if(cardLengthLongEnough(length)) {
			seperatedNumber = new int[length];
			for(int i = 0; i < length; i++) {
				char num = cardNumber.charAt(i);
				String number = "" + num;
				seperatedNumber[i] = Integer.parseInt(number);
			}
		}
	}

	// Check to see if card has enough numbers
	public boolean cardLengthLongEnough(int length) {
		if((length >= 13) && (length <= 16)) {
			return true;
		} else {
			return false;
		}
	}

	// Determine the card vendor
	public void determineCardVendor() {
		int numberOne = seperatedNumber[0];
		int numberTwo = seperatedNumber[1];
		if(numberOne == 4) {
			cardType = "visa";
		} else if(numberOne == 5) {
			cardType = "master";
		} else if((numberOne == 3) && (numberTwo == 7)) {
			cardType = "amex";
		} else if(numberOne == 6) {
			cardType = "discover";
		}
	}

	// Implement the Luhn check for validity
	public boolean validity() {
		// Double every number from right to left.
		// If doubling digit == two-digit num, add two digits to get a single digit num
		int firstSum = 0;
		int secondSum = 0;
		for(int i = 0; i < seperatedNumber.length; i++) {
			// if array id is odd, double
			if((i % 2 != 0) && (i > 0)) {
				// If number is doubled, add to one total
				seperatedNumber[i] *= 2;
				// Check if num is > 10
				if(seperatedNumber[i] > 10) {
					// harvest nums and add together
					seperatedNumber[i] = sumDigits(seperatedNumber[i]);
				}
				firstSum += seperatedNumber[i];
			} else {
				// If number is not doubled, add to another total
				secondSum += seperatedNumber[i];
			}
		}

		// Add both together
		int total = firstSum + secondSum;
		// If number above % 10 == 0 num is valid
		if(total % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Add digits of a num
	public int sumDigits(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	public boolean go() {
		seperateDigitsFromString();
		for(int i = 0; i < seperatedNumber.length; i++) {
			System.out.print(seperatedNumber[i]);
		}
		System.out.println("");
		if(validity()) {
			for(int i = 0; i < seperatedNumber.length; i++) {
				System.out.print(seperatedNumber[i]);
			}
			System.out.println("");
			return true;
		} else {
			for(int i = 0; i < seperatedNumber.length; i++) {
				System.out.print(seperatedNumber[i]);
			}
			System.out.println("");
			return false;
		}
	}

	public static void main(String[] args) {
		CreditCard card = new CreditCard("4388576018402626");
		System.out.println(card.go());
		CreditCard differentCard = new CreditCard("4388576018410707");
		System.out.println(differentCard.go());
		// System.out.println(0 % 0);
	}


}
