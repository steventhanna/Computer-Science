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
	
	public static void switchStatement() {
		// switch will work with char, byte, short, int or String
		int inputScore = (int)(Math.round(score));
		switch(inputScore) {
			case 100: 
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputInfo();
		letterGrade();
		System.out.println(grade);
		for(int i=100; i>0; i--) {
			System.out.println("case " + i + ":");
		}
	}

}
