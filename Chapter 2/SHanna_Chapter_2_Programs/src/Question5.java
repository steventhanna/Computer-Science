import java.util.*;

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