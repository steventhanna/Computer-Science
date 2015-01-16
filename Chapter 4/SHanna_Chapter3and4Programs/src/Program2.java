import java.util.*;

public class Program2 {

	private static int rock = 0;
	private static int paper = 1;
	private static int scissor = 2;
	private static int userNumber;
	private static int AI;
	
	public static void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your move: rock (0), paper (1), scissor (2) ");
		userNumber = scanner.nextInt();
	}
	
	public static void generateAINumber() {
		Random random = new Random();
		AI = random.nextInt(3);
	}
	
	public static void compareAnswers() {
		if(userWin(userNumber, AI)) {
			System.out.println("User wins");
		} else {
			System.out.println("User loses");
		}
		System.out.println("AI has: " + AI);
	}
	
	public static boolean userWin(int user, int AI) {
		if((user == 0) && (AI == 2)) {
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
		getUserInput();
		generateAINumber();
		compareAnswers();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		go();

	}

}
