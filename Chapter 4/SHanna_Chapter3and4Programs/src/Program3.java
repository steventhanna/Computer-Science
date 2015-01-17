import java.util.*;

public class Program3 {

	private static ArrayList<Integer> numbers = new ArrayList<Integer>();
	private static int positiveCounter = 0;
	private static int negativeCounter = 0;
	private static int sum = 0;
	private static double average;

	public static void userInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number. (Input terminates with 0): ");
		int input = scanner.nextInt();
		if(!(input == 0)) {
			numbers.add(input);	
			userInput();
		} else {
			calculate();
		}
		
	}

	public static void calculate() {
		for(int i = 0; i < numbers.size(); i++) {
			int number = numbers.get(i);
			sum += number;
			if(number > 0) {
				positiveCounter++;
			} else {
				negativeCounter++;
			}
		}
		average = (double)sum / numbers.size();
	}

	public static void report() {
		System.out.println("The number of positives is: " + positiveCounter);
		System.out.println("The number of negatives is: " + negativeCounter);
		System.out.println("The total is: " + sum);
		System.out.println("The average is: " + average);
	}

	public static void go() {
		userInput();
		report();
	}

	public static void main(String[] args) {
		go();

	}

}
