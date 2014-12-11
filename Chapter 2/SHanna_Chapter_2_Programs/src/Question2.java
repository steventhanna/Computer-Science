/*
 * Steven Hanna
 * Chapter 2: Question 2
 * Objective: Create a program called GradeCalculator, which prompts the
 * user to input 5 test scores out of 100 points. The program then should
 * output their grade average rounded to the nearest tenth of a percent.
 * (For an extra challenge, try to see if you can also output the letter grade.)
 */

import java.util.*;

public class Question2 extends HelpfulMethods{

	public static void main(String[] args) {
		
		// Input test scores
		double[] testScores = new double[5];
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<5; i++) {
     		int count = i + 1;
			System.out.println("Enter the " + count + " test score");
			double score = scanner.nextDouble();
			if(score > 100) {
				print("You entered a score above 100");
				break;
			} else {
				testScores[i] = score;
			}
		}
		scanner.close();
		
		 // computer average
		 double average = (testScores[0] + testScores[1] + testScores[2] + testScores[3] + testScores[4]) / 5;
		 // average = Math.round((average * 10) / 10);
		 print("The average test score is " + average);
		
	}

}
