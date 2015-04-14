
public class FormattingStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount = 17.51;
		double simpleInterest = 0.0195;
		int numYears = 11;
		
		double newAmount = calculateNewAmount(amount, simpleInterest, numYears);
		System.out.println("Your new balance is " + newAmount);
	}
	
	public static double calculateNewAmount(double amt, double simpleInterest, int numYears) {
		return amt + amt * simpleInterest * numYears;
	}

}
