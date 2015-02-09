import java.util.*;
import java.awt.*;


public class Conversions {

	public static String decimalToOctal(int x) {
		String result = "";
		int newNumber = x;
		int num = 0;
		while(newNumber % 8 != 0) {
			num = newNumber % 8;
			System.out.println(num);
			newNumber = x / 8;
			result = result + num;
		}
		System.out.println("test" + result);
		return result;
	}
	
	public static char toHexChar(int hexValue) {
		if(hexValue <= 9 && hexValue >= 0) {
			return (char)(hexValue + '0');
		} else {
			return (char)(hexValue - 10 + 'A');
		}
	}
	
	public static String decimalToHex(int base, int decimal) {
		String hex = "";
		
		while(decimal !=0) {
			int hexValue = decimal % base;
			hex = toHexChar(hexValue) + hex;
			decimal = decimal / base;
		}
		return hex;
	}
	
	public static void main(String[] args) {
		// decimalToOctal(2163);
		decimalToHex(16, 15599);
	}

}
