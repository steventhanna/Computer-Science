import java.util.*;

public class Average {
	
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.println("Enter the " + i + " number:");
			if(i==1) {
				a = scanner.nextDouble();
			} else if(i==2) {
				b = scanner.nextDouble();
			} else if(i==3) {
				c = scanner.nextDouble();
			}
			
		}
		scanner.close();
		double average = (a + b + c) / 3;
		System.out.println("Average is " + average);
	}
	
}
