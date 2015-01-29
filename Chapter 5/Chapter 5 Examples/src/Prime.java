/*
 * @author: Steven Hanna
 * @class: Prime
 * @date: 1.29.15
 * @description: print n prime numbers
 */
public class Prime {
	
	public static boolean isPrime(long n) {
	    if(n <= 3) {
	        return n > 1;
	    } else if(n % 2 == 0 || n % 3 == 0) {
	        return false;
	    } else {
	        for(int i = 5; i * i <= n; i += 6) {
	            if(n % i == 0 || n % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
	
	public static void printNumbers(int amountOfPrimes) {
		int[] amountCounter = new int[amountOfPrimes];
		int counter = 0;
		int primer = 1;
		// Assign to array
		while(counter < amountOfPrimes) {
			if(isPrime(primer)) {
				// System.out.println(primer);
				amountCounter[counter] = primer;
				counter++;
			}
			primer++;
		}
		// Print out ten at a time
		int printCounter = 0;
		int remainderCounter = 0;
		while(printCounter < amountOfPrimes) {
			printCounter += 10;
			for(int i=printCounter - 10; i < printCounter; i++) {
				System.out.print(amountCounter[i] + " ");
				remainderCounter++;
			}
			System.out.println("");
			printCounter = remainderCounter;
		}
		int finalRemainder = amountOfPrimes - printCounter;
		for(int i=remainderCounter; i < finalRemainder + remainderCounter; i++) {
			System.out.print(amountCounter[i]);
		}	
	}
	
	public static void main(String[] args) {
		printNumbers(300);

	}

}
