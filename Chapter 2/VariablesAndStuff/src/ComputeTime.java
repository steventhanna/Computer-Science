import java.util.Scanner;
import java.util.Date;

public class ComputeTime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Seconds: ");
		int seconds = scanner.nextInt();
		scanner.close();
		
		// Ask a user for a time in seconds and change it to minutes
		int minutes = seconds / 60;
		int numberOfSeconds = seconds % 60;
		
		
		
		// Number of hours
		
		int hours = minutes / 60;
		int numberOfMinutes = minutes % 60;
		if(numberOfMinutes < 0) {
			numberOfMinutes = 0;
		}
		int days = hours / 24;
		int numberOfHours = hours % 24;
		if(numberOfHours < 0) {
			numberOfHours = 0;
		}
		
		int weeks = days / 7;
		int numberOfDays = days % 7;
		if(numberOfDays < 0) {
			numberOfDays = 0;
		}
		
		int years = weeks / 52;
		int numberOfWeeks = weeks % 52;
		if(numberOfWeeks < 0) {
			numberOfWeeks = 0;
		}
		
		if(years < 0) {
			years = 0;
		}
 		
		System.out.println("The amount of time = " + years + " years " + numberOfWeeks + " weeks "+ numberOfDays + " days " + numberOfHours + " hours " + numberOfMinutes + " minutes " + numberOfSeconds + " seconds");
		
		
	}

}
