/*
 * Steven Hanna
 * Chapter 2: Program 5
 * Objective:  The equation represents an equation for compound interest, where P 
 * represents your principal or starting value, r your nominal interest rate in decimal form, n 
 * the number of times the interest is compounded, and t represents time in years. Write a program 
 * that prompts the user to enter in the required information to calculate the future value of an
 * investment. It should round the answer to the nearest penny.
 */

import java.util.*;

@SuppressWarnings("unused")
public class Question5 extends HelpfulMethods {
	private static double principal;
	private static double nominalInterest;
	private static double compoundRate;
	private static double time;

	public static double calculate() {
	  double stepOne = (1 + (nominalInterest / compoundRate));
	  double stepTwo = Math.pow(stepOne, compoundRate * time);
	  double stepThree = principal * stepTwo;
	  // Round the answer
	  double answer = Math.round(stepThree * 100.0) / 100.0;
	  return answer;
	}

	public static void main(String[] args) {
		//Ask the user for the information.
		principal = inputDouble("Enter the principal: ");
		nominalInterest = inputDouble("Enter the interest: ");
		compoundRate = inputDouble("Enter the compound reate: ");
		time = inputDouble("Enter the time: ");
		double result = calculate();
		print("Future value of investment is: " + result);
	}
}