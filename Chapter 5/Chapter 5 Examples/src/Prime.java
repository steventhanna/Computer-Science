import java.util.ArrayList;

/**
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

	public static void printPrimes(int num) {
		int counter = 0, lineCounter = 0, primer = 0;
		while(counter < num) {
			if(isPrime(primer)) {
				if(lineCounter < 10) {
					System.out.print(primer + " ");		
				} else {
					System.out.print("\n  " + primer);
					lineCounter = 0;
				}
				counter++;
				lineCounter++;
			}			
			primer++;
		}
	}
	
	public static void printFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = number-1; i>0; i--) {
			if(number % i == 0) {
				factors.add(i);
			}
		}
		int size = factors.size();
		int lineCounter = 0;
		for(int i = 0; i<size; i++) {				
			if(lineCounter < 10) {
				System.out.print(factors.get(i) + " ");
				lineCounter++;
				if((lineCounter == 9) && i < 10) {
					lineCounter++;
				}
			} else {
				System.out.println(factors.get(i) + " ");
				lineCounter = 1;
			}
		}
	}
	public static void main(String[] args) {
		printPrimes(211);
		printFactors(200000);

	}

}
