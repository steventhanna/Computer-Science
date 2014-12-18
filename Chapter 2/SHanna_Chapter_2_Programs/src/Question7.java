import java.util.*;

public class Question7 extends Distance {

	private static int[] point1 = new int[2];
	private static double distance1;
	private static int[] point2 = new int[2];
	private static double distance2;
	private static int[] point3 = new int[3];
	private static double distance3;
	private static double s;
	
	
	public static void inputPoints() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input x value of point 1");
		point1[0] = scanner.nextInt();
		System.out.println("Input y value of point 1");
		point1[1] = scanner.nextInt();
		System.out.println("Input x value of point 2");
		point2[0] = scanner.nextInt();
		System.out.println("Input y value of point 2");
		point2[1] = scanner.nextInt();
		System.out.println("Input x value of point 3");
		point3[0] = scanner.nextInt();
		System.out.println("Input y value of point 3");
		point3[1] = scanner.nextInt();
		scanner.close();
	}
	
	public static void computeDistance() {
		distance1 = calculateDistance(point1, point2);
		distance2 = calculateDistance(point1, point3);
		distance3 = calculateDistance(point3, point2);
	}
	
	public static void computeS() {
		s = (distance1 + distance2 + distance3) / 2;
	}
	
	public static void computeArea() {
		inputPoints();
		computeDistance();
		computeS();
		double area = Math.sqrt((s * (s - distance1) * (s - distance2) * (s - distance3)));
		System.out.println("The area of the trinagle is: " + area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computeArea();
		System.out.println("s: " + s);
		System.out.println(distance1 + " " + distance2 + " " + distance3);
		
	}

}
