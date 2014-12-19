/*
 * Steven Hanna
 * Chapter 2: Program 4
 * Objective: Write a program that prompts the user to enter
 * the minutes (e.g., 1 billion) and displays the number of 
 * years and days and remaining minutes for the minutes. For
 * simplicity, assume a year has 365 days.
 */

public class Question4 extends HelpfulMethods {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oneDay = 1440; // minutes
		int oneYear = 525600; // number of minutes in a year, 365 days
		
		double minutes = inputDouble("Enter the amount of minutes");
		
		double convertToYears = minutes / oneYear; // calculate the amount of years
		double convertToDays = ((minutes % oneYear) / oneDay);
		double convertToMinutes = ((minutes % oneDay));
		convertToYears = Math.round(convertToYears - .5);
		convertToDays = Math.round(convertToDays);
		convertToMinutes = Math.round(convertToMinutes);
		
//		double years = minutes / 525949;
//		years = Math.round(years + .5);
		// Years works correctly 
		
		print(convertToYears + " years");
		print(convertToDays + " days");
		print(convertToMinutes + " minutes");
		
		

	}

}
