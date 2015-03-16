/**
 * @author steventhanna
 * @class Program5
 * @date 3/12/15
 * @description Write a method that determines whether a given number is a median
 * for values stored in an array
 */

import java.util.Scanner;

public class Program5 {

	
	public static boolean isMedian(double[] sample, double m) {
		double[] sorted = sort(sample);
		// User error handling
		if(m > sorted.length) {
			System.out.println("The number inputted is out of the range of the array");
			return false;
		}
		// Find id of m
		int idM = 0;
		int mediumNumber = (sorted.length - 1) / 2;
		for(int i = 0; i < sorted.length; i++) {
			if(m == sorted[i]) {
				idM = i;
			}
		}
		if(idM == mediumNumber) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static double[] sort(double[] array) { 
		int increment = array.length / 2;
		while(increment > 0) {
			for(int i = increment; i < array.length; i++) {
				int j = i;
				double temp = array[i];
				while(j >= increment && array[j - increment] > temp) {
					array[j] = array[j - increment];
					j = j - increment;
				}
				array[j] = temp;
			} if(increment == 2) {
				increment = 1;
			} else {
				increment *= (5.0 / 11);
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		double[] test = new double[10];
		for(int i = test.length - 1; i >= 0; i--) {
			test[i] = i;
		}
		// Should go from 0 - 9
		// System.out.println(isMedian(test, 4));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to test the median");
		System.out.println(isMedian(test, scanner.nextInt()));
		scanner.close();
		
	}
}
