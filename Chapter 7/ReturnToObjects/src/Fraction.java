
public class Fraction extends Exception {
	
	
	// field or instance variable
	// have default values, unlike local var
	private int numerator;
	private int denominator;
	
	// Constructor
	// Initalize fields for a specific instance 
	public Fraction(int num, int denom) {
		if(denom == 0) {
			throw new IllegalArgumentException("Denominator cannot == 0");
		} else {
			denominator = denom;
			numerator = num;
			reduce();
		}
	}
	
	// Copy constructor
	public Fraction(Fraction other) {
		numerator = other.numerator;
		denominator = other.denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public double fracToDecimal() {
		return (double)numerator / denominator;
	}
	
	public void reduce() {
		
	}
	
	public int gcd(int a, int b) {
		while(b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public Fraction add(Fraction other) {
		int newNum = numerator * other.denominator + denominator * other.numerator;
		int newDenom = denominator * other.denominator;
		return new Fraction(newNum, newDenom);
	}
	
	public Fraction multiply(Fraction other) {
		int newNum = numerator * other.numerator;
		int newDenom = denominator * other.denominator;
		return new Fraction(newNum, newDenom);
	}
	
	public Fraction multiply(int n) {
		int newNum = numerator * n;
		return new Fraction(newNum, denominator);
	}
	
	public Fraction reduce(Fraction other) {
		
		
	}
}
