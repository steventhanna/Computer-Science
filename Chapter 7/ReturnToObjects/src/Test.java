
public class Test {
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(5, 6);
		Fraction f3 = new Fraction(22, 7);
		Fraction f4 = new Fraction(20, 4);
		Fraction f5 = new Fraction(1, 4);
		Fraction f6 = new Fraction(1, 5);
		Fraction f7 = new Fraction(-2, 3);
		
		Fraction sum = f1.add(f6);
		System.out.println(sum);
	}
}
