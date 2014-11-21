import java.util.*;
import java.math.*;

public class ComputeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius");
		double radius = scanner.nextDouble();
		scanner.close();
		final double PI = Math.PI;
		
		double area = (PI * Math.pow(radius, 2));
		System.out.println(area);
		
	}

}
