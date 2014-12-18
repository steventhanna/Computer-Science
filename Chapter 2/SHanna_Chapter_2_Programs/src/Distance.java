/*
 * Steven Hanna
 * Chapter 2: Distance
 * Objective: Write a program that prompts the user to enter two
 * points (x1,y1) and (x2,y2) and displays 22 their distances. 
 * The formula for computing the distance  . 
 * Note you can use Math.pow(a, 0.5) to compute a . Your main method 
 * should be in a class of its own.
 */

public class Distance {
	
	public static double calculateDistance(int[] point1, int[] point2) {
		int subtractionX = point2[0] - point1[0];
		int subtractionY = point2[1] - point1[1];
		double combination = Math.pow(subtractionX, 2) + Math.pow(subtractionY, 2);
		double rootedCombo = Math.sqrt(combination);
		return rootedCombo;
	}
	

}
