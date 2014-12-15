import java.util.*;

public class PracticeASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// characters are defined with single quotes
//		char ch1 = '!';
//		char ch2 = 'E';
//		char c3 = 'R';
//		
//		int x = 83;
//		int y = 110;
//		
//		System.out.println((int)ch1);
//		System.out.println((char)x);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an int: ");
		int num = scanner.nextInt();
		
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("The number is divisible by both 2 and 3");
		}
		
		if(num % 2 == 0 || num % 3 == 0) {
			System.out.println("The number is divisible by 2 or 3");
		}
		if(num % 2 == 0 ^ num % 3 == 0) {
			System.out.println("The number is divisivle by 2 or 3, but not both");
		}
		
	}

}
