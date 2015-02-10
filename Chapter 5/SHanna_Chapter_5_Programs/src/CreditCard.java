
public class CreditCard {

	private long cardNumber;
	private int[] seperatedNumber;
	private String cardType;

	// Create constructor
	public CreditCard(long number) {
		// Assign number to cardNumber
		cardNumber = number;
	}

	// Separate digits of cardNumber into an array  seperatedNumber
	public void seperateDigits() {
		// Get length of cc 
		int length = (int) Math.log10(cardNumber) + 1;
		if(cardLengthLongEnough(length)) {
			// Init seperatedNumber
			seperatedNumber = new int[length];
			// Separate digits from cc number into array
			long cardClone = cardNumber; // create card clone to not damage initial cardNumber
			int counter = length; // counter to add to array
			while(cardClone > 0) {
				int d = (int) (cardClone / 10);
				int k = (int) (cardClone - d * 10);
				cardClone = d;
				seperatedNumber[counter - 1] = k; // take into account the array index system
				counter--;
			}
		} else {
			System.out.println("Card number is not long enough");
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
	public void validity() {
		// reassign array to avoid damage
		int[] numbersClone = new int[seperatedNumber.length];
		for(int i = 0; i < seperatedNumber.length; i++) {
			numbersClone[i] = seperatedNumber[i];
		}
		// Double every second digit from left to right
		int counter = 1;
		int arrayCounter = numbersClone.length;
		int length = numbersClone.length;
		int amountToDouble = length / 2;
		while(counter <= amountToDouble) {
			if(counter == 1) {
				arrayCounter -= 1;
			} else {
				arrayCounter -= 2;
			}
			numbersClone[arrayCounter] *= 2;
			counter++;
		}
		for(int i=0; i < numbersClone.length; i++) {
			System.out.print(numbersClone[i]);
		}
	}

	public static void main(String[] args) {
		CreditCard card = new CreditCard(43885760184026L);
		// System.out.print(card.seperateDigits());
		card.seperateDigits();
		for(int i=0; i < card.seperatedNumber.length; i++) {
			System.out.print(card.seperatedNumber[i] + " ");
		}
		card.validity();
		
	}


}
