import java.util.*;

public class FtoC {

	public static double convert(double f) {
		double result = (5/9) * (f - 32);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the degree in Fahrenheit");
		double input = scanner.nextDouble();
		scanner.close();
		double answer = convert(input);
		System.out.println("The degree in Centigrade is: " + answer);

		System.out.println(System.currentTimeMillis());
	}

}
