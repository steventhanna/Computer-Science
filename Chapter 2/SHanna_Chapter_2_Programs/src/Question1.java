/*
 * Steven Hanna
 * Chapter 2: Question 1
 * Objective: Create a program called Cylinder. This program should ask the user
 * to input a radius and a height of any size, then output the surface area and
 * volume. Create a constant called PI for this program, it may be a field or 
 * local variable.
 */

public class Question1 extends HelpfulMethods {

	final private static double pi = Math.PI;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = inputDouble("Enter the radius of the cylinder: ");
		double h = inputDouble("Enter the height of the cylinder: ");
		
		double surfaceArea = (2 * pi * r * h) + (2 * pi * r * 2);
		double volume = (pi * Math.pow(r, 2) * h);
		
		print("Surface area = " + surfaceArea);
		print("Volume = " + volume);
	}

}
