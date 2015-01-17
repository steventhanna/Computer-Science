import java.util.*;

public class Program2 {

	private static int rock = 0;
	private static int paper = 1;
	private static int scissor = 2;
	private static int userNumber;
	private static int AI;
	private static int counter = 0;
	private static int userWins = 0;
	private static int AIWins = 0;
	
	public static void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your move: rock (0), paper (1), scissor (2) ");
		userNumber = scanner.nextInt();
		if((userNumber > 2) || (userNumber < 0)) {
			System.out.println("The number you entered was not 0, 1, or 2.  Please try again.");
			getUserInput();
		}
	}
	
	public static void generateAINumber() {
		Random random = new Random();
		AI = random.nextInt(3);
	}
	
	public static void compareAnswers() {
		if(userWin(userNumber, AI)) {
			System.out.println("User wins");
			userWins++;
		} else {
			System.out.println("AI wins");
			AIWins++;
		}
		if(AI == 0) {
			System.out.println("AI is rock");
		} else if(AI == 1) {
			System.out.println("AI is paper");
		} else {
			System.out.println("AI is scissor");
		}
		if(userNumber == 0) {
			System.out.println("User is rock");
		} else if(userNumber == 1) {
			System.out.println("User is paper");
		} else {
			System.out.println("User is scissor");
		}
		System.out.println("Total user wins: " + userWins);
		System.out.println("Total AI wins: " + AIWins);
		
		
		
	}
	
	public static boolean userWin(int user, int AI) {
		if(user == AI) {
			System.out.println("Tie");
			return false;
		} else if((user == 0) && (AI == 2)) {
			return false;
		} else if((AI == 0) && (user == 2)) {
			return true;
		} else if(user > AI) {
			return true;
		} else {
			return false;
		}
	}
	 
	public static void go() {
		while((userWins < 2) && AIWins < 2) {
			getUserInput();
			generateAINumber();
			compareAnswers();
			counter++;
		}
		if(userWins == 2) {
			System.out.println("Game terminated.  User has won twice.");
		} else {
			System.out.println("Game terminated.  AI has won twice.");
		}


	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		go();

	}

}
