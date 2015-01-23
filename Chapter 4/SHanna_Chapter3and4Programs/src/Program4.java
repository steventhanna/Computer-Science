import java.util.*;

public class Program4 {

	private static int userSelection;

	public static void userInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a pattern: (1) (2) (3) (4)");
		userSelection = scanner.nextInt();
		if((userSelection < 1) || (userSelection > 4)) {
			System.out.println("Invalid choice.  Try again");
			userInput();
		}
	}

	public static void pattern1() {
		System.out.println("Pattern I");
		for(int i=1; i<=6; i++) {
			System.out.println(i);
			for(int a = 1; a<=i; a++) {
				System.out.print(a + " ");
			}
		}
	}
	
	public static void pattern2() {
		System.out.println("Pattern 2");
		for(int i=6; i>0; i--) {
			for(int a=1; a<=i; a++) {
				System.out.print(a + " ");
			}
			System.out.println("");
		}
	}
	
	public static void pattern3() {
		System.out.println("Pattern 3");
		for(int i=1; i<=6; i++) {
			System.out.println();
			for(int k=6; k>i; k--) {
				System.out.print(" " + " ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
		}
	}
	
	public static void pattern4() {
		System.out.println("Pattern 4");
		for(int i=1; i<=6; i++) {
			System.out.println(" ");
			for(int a=0; a<i; a++) {
				System.out.print(" " + " ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern4();
	}

}
