/*
 * Steven Hanna
 * Chapter 2: Program 4
 * Objective: Write a program that prompts the user to enter
 * the minutes (e.g., 1 billion) and displays the number of 
 * years and days and remaining minutes for the minutes. For
 * simplicity, assume a year has 365 days.
 */

import java.util.*;

public class Question4 extends HelpfulMethods {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double minutes = inputDouble("Enter the amount of minutes");
		// Amount of mins in a day = 1440
		double years = minutes / 525949;
		double days = minutes % 525949;
		double remainingDays = days / 1440;
		double remainingMinutes = remainingDays / 1440;
		print("Amount of years " + years);
		print("Amount of days " + remainingDays);
		print("Amount of minutes " + remainingMinutes);
		

	}

}
