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
		
		System.out.println("The amount of time = " + minutes + " minutes " + numberOfSeconds + " seconds");
		
		
	}

}
