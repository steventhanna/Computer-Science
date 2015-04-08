import java.util.*;

public class Working2 {
	
	public static boolean isPalindrome(String s) {
		// Split into an array
		String[] test = s.split("");
		String reversed = "";
		for(int i = test.length - 1; i <= 0; i--) {
			reversed += test[i];
		}
		// String reversed = new StringBuilder(s).reverse().toString();
		
		if(reversed.equals(s)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Prompt user
		System.out.print("Enter a string: ");
		String s = scanner.nextLine();
		if(isPalindrome(s)) {
			System.out.print(s + " is a palindrome");
		} else {
			System.out.print(s + " is a palindrome");
		}
		scanner.close();
	}

}
