import java.util.Scanner;

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
		for(int i=0)
	}
	
	public static void main(String[] args) {
		printNumbers(300);

	}

}
