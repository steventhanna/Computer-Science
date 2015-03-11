import java.util.Scanner;

/**
 * @author steventhanna
 * @class Program2
 * @date 3/11/15
 * @description Write a method that finds the three largest elements 
 * in an array of doubles using the following header:
 */
public class Program2 {
	
	public static double[] min(double[] array) {
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
		double[] result = new double[3];
		for(int i = 0; i < result.length; i++) {
			result[i] = array[array.length - 1 - i];
		}
		return result;
		
	}
	
	public static double[] putInOrder(double[] array) {
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
		// Test of above
		Scanner scanner = new Scanner(System.in);
		double[] nums = new double[10];
		System.out.println("Enter 10 nums: ");
		for(int i = 0; i < 10; i++) {
			nums[i] = scanner.nextDouble();
		}
		double[] threeSmall = min(nums);
		double[] order = putInOrder(nums);
		System.out.println("The three largest numbers are: ");
		for(int i = 0; i < threeSmall.length; i++) {
			System.out.print(threeSmall[i] + " ");
		}
		System.out.println();
		System.out.println("The numbers in order are: ");
		for(int i = 0; i < order.length; i++) {
			System.out.print(order[i] + " ");
		}
	}
}
