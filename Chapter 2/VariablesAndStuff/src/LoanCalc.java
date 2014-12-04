import java.util.*;

public class LoanCalc {

	private static double interestRate = 0;
	private static double loanAmount = 0;
	private static double numberOfYears = 0;
	
	public static void enterPaymentInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the interest rate: ");
		interestRate = scanner.nextDouble();
		interestRate /= 12;
		System.out.print("Enter the loan amount: ");
		loanAmount = scanner.nextDouble();
		System.out.print("Enter the number of years: ");
		numberOfYears = scanner.nextDouble();
		scanner.close();
	}
	
	public static void calculateLoan() {
		enterPaymentInfo();
		double monthlyPaymentUpper = (loanAmount * interestRate);
		System.out.println(monthlyPaymentUpper);
		double monthlyPaymentLower = (1 - (1 / (Math.pow(1 + interestRate, numberOfYears * 12))));
		System.out.println(monthlyPaymentLower);
		double monthlyPayment = monthlyPaymentUpper / monthlyPaymentLower;
		monthlyPayment = Math.round(monthlyPayment);
		double totalPayment = monthlyPayment * numberOfYears * 12;
		totalPayment = Math.round(totalPayment);
		
		System.out.println("The montly payment is $" + monthlyPayment + " and the total payment is $" + totalPayment);
	}
	
	public static void main(String[] args) {
		calculateLoan();

	}

}
