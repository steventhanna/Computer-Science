import javax.swing.*;

public class UsingADialogBox {

	
	
	public static void main(String[] args) {
		
		// Enter annual interest rate
		String annualInterestRateString = JOptionPane.showInputDialog("Enter annual interest rate, for example 8.25"); 
		
		
		double annualInterstRate = Double.parseDouble(annualInterestRateString);
		
		// Obtain monthly interest rate
		
		double monthlyInterestRate = annualInterstRate / 1200;
		
		// Enter number of years
		String numberOfYearsString = JOptionPane.showInputDialog("Enter the number of years: ");
		int numberOfYears = Integer.parseInt(numberOfYearsString);
		
		
		// Enter loan amont
		String loanString = JOptionPane.showInputDialog("Enter the loan amount");
		double loanAmount = Double.parseDouble(loanString);
		
		
	}

}
