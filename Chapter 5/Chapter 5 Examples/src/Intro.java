import java.util.*;
import java.awt.*;

public class Intro {

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
