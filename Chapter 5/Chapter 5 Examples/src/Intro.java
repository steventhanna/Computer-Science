import java.util.*;
import java.awt.*;

public class Intro {

	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static int max(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int max(int num1, int num2, int num3) {
		return max(max(num1, num2), num3);
	}
	
	public static double max(double num1, int num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	
	public static int sum(int lowerBound, int upperBound) {
		int sum = 0;
		for(int i=lowerBound; i<=upperBound; i++) {
			sum +=i;
		}
		return sum;
	}
	
	public static void increaseNumber(int n) {
		n++;
		System.out.println("Value of n inside the method is " + n);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int sum = sum(1,10);
		// System.out.println(sum);
		
		int n = 5;
		increaseNumber(n);
		
	}

}
