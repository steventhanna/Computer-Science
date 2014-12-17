import java.util.*;

public class GradeDisplayer {

	private static double score;
	private static char grade;
	
	public static void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your score as a percent: ");
		score = scanner.nextDouble();
	}
	
	public static void letterGrade() {
		if(score <= 59.5) {
			grade = 'F';
		} else if(score <= 69.5) {
			grade = 'D';
		} else if(score <= 79.5) {
			grade = 'C';
		} else if(score <= 89.5) {
			grade = 'B';
		} else {
			grade = 'A';
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputInfo();
		letterGrade();
		System.out.println(grade);
	}

}
