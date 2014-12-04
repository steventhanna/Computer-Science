import java.util.*;

public class SalesTax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter purchase amount: ");
		double purchaseAmount = scanner.nextDouble();
		scanner.close();
		
		double tax = purchaseAmount * 0.085;
		
		tax = (int)(tax * 100) / 100.0;
		double total = purchaseAmount + tax;
		total = Math.round(total * 100) / 100;
		
		System.out.println("Sales tax is $" + tax);
		System.out.println("The final amount is $" + total);
		
		double j = 61/3;
		double j2 = 61.0/3.0;
		
		System.out.println(j);
		System.out.println(j2);

	}

}
