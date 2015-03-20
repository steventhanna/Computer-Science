public class Fraction extends Exception {
	
	
	// field or instance variable
	// have default values, unlike local var
	private int numerator;
	private int denominator;
	
	// Constructor
	// Initialize fields for a specific instance 
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
	
	// Getters
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}

	// Setters
	public void setNumerator(int n) {
		numerator = n;
	}

	public void setDenominator(int d) {
		if(d != 0) {
			denom = d;
			reduce();
		} else {
			throw new IllegalArgumentException("Fraction construction error: denominator == 0");
		}
		denominator = d;
	}
	
	public double fracToDecimal() {
		return (double)numerator / denominator;
	}
	
	public int gcd(int a, int b) {
		while(a != b) {
			if(a > b) {
				a -= b;
			} else {
				b -= a;
			}
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
	
	// helper method
	// Private in this case, means that only Fraction objects can access this method
	private void reduce() {
		if(numerator == 0) {
			denominator = 1;
			return;
		}
		if(denominator < 0) {
			numerator = -numerator;
			denominator = -denominator;
			
		}

		int divisor = gcd(Math.abs(numerator), denominator);
		numerator /= divisor;
		denominator /= divisor;
	}
	
	// Very handy here.
	public String toString() {
		return numerator + "/" + denominator;
	}
}
