/**
 * @author steventhanna
 * @class Program1
 * @date 3/11/15
 * @description Write a program that reads student scores, gets the best score, 
 * and then assigns grades based on the following scheme:
 */

import java.util.*;

public class Program1 {

	private static String[] grades;
	private static int[] values;
	
	public static  void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of students: ");
		int studentAmount = scanner.nextInt();
		grades = new String[studentAmount];
		values = new int[studentAmount];
		System.out.println("Enter " + studentAmount + " scores: ");
		for(int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
	}
	
	public static  void deteremineLetterGrade(int[] val) {
		// get best score
		int max = val[0];
		for(int i = 1; i < val.length; i++) {
			if(max < val[i]) {
				max = val[i];
			}
		}
		
		for(int i = 0; i < val.length; i++) {
			if(val[i] >= max - 10) {
				grades[i] = "A";
			} else if(val[i] >= max - 20) {
				grades[i] = "B";
			} else if(val[i] >= max - 30) {
				grades[i] = "C";
			} else if(val[i] >= max - 40) {
				grades[i] = "D";
			} else {
				grades[i] = "F";
			}
		}
	}
	
	public static void go() {
		getInput();
		deteremineLetterGrade(values);
		for(int i = 0; i < grades.length; i++) {
			System.out.println("Student " + i + " score is " + values[i] + " and grade is " + grades[i]);
		}
	}
	
	public static void main(String[] args) {
		go();
	}
}
