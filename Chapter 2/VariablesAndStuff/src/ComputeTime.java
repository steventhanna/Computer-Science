import java.util.Scanner;
import java.util.Date;

public class ComputeTime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Seconds: ");
		double seconds = scanner.nextDouble();
		scanner.close();
		
		// Ask a user for a time in seconds and change it to minutes
		double minutes = seconds / 60;
		double numberOfSeconds = seconds % 60;
		
		
		
		// Number of hours
		
		double hours = minutes / 60;
		double numberOfMinutes = minutes % 60;
		if(numberOfMinutes < 0) {
			numberOfMinutes = 0;
		}
		double days = hours / 24;
		double numberOfHours = hours % 24;
		if(numberOfHours < 0) {
			numberOfHours = 0;
		}
		
		double weeks = days / 7;
		double numberOfDays = days % 7;
		if(numberOfDays < 0) {
			numberOfDays = 0;
		}
		
		double years = weeks / 52;
		double numberOfWeeks = weeks % 52;
		if(numberOfWeeks < 0) {
			numberOfWeeks = 0;
		}
		
		if(years < 0) {
			years = 0;
		}
 		
		System.out.println("The amount of time = " + years + " years " + numberOfWeeks + " weeks "+ numberOfDays + " days " + numberOfHours + " hours " + numberOfMinutes + " minutes " + numberOfSeconds + " seconds");
		
		
	}

}
