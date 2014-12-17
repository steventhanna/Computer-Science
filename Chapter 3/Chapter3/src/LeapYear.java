import java.util.*;

public class LeapYear {

	private static int year;
	
	public static boolean divisibleBy4() {
		if(year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean divisibleBy100() {
		if(year % 100 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean divisibleBy400() {
		if(year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year to check if it is a leap year: ");
		year = scanner.nextInt();
		scanner.close();
		if((divisibleBy4() && !divisibleBy100()) || divisibleBy400()) {
			System.out.println("The year " + year + " is a leap year");
		} else {
			System.out.println("The year " + year + " is not a leap year");
		}

	}

}
