/**
* @author Steven Hanna
* @class Converter
* @description Convert a decimal number into hex, octal, and binary
*/

import java.util.Scanner; 

public class Converter {


	
	// For Homework, write the methods to convert decimals to 
	// octal and binary. 
	
	// Decimal to hex
	public static String decimalToHex(int decimal) {
		String hex = ""; 
		
		while(decimal != 0) {
			int hexValue = decimal % 16; 
			
			hex = toHexChar(hexValue) + hex; 
			
			decimal = decimal / 16; 
		}
		
		return hex; 
	}
	
	public static char toHexChar(int hexValue) {
		if (hexValue <= 9 && hexValue >= 0) {
			return (char)(hexValue + '0'); 
		} else {
			return (char)(hexValue - 10 + 'A'); 
		}
	}

	// Decimal to octal 
	
	public static int decimalToOctal(int octalNumber){
	   int counter = 0;
	   int result = 0;
	   while(octalNumber !=0) {
	        int temp = (int)((octalNumber % 8) * Math.pow(10, counter));
	        counter++;
	        result += temp;
	        octalNumber /= 8;
	    }
	    return result;
	}

	// Decimal to binary
	public static String decimalToBinary(int number) {
       if (number == 0) {
           return "0";
       }
       String binary = "";
       while (number > 0) {
           int remainder = number % 2;
           binary = remainder + binary;
           number = number / 2;
       }
       return binary;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter a decimal number: "); 
		int decimal = input.nextInt(); 
		
		System.out.println("The hex number for decimal " + decimal + " is " + decimalToHex(decimal));
		System.out.println("The oct number for decimal " + decimal + " is " + decimalToOctal(decimal));
		System.out.println("The binary number for decimal " + decimal + " is " + decimalToBinary(decimal));
		
	}
}
