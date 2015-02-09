
public class Program1 {

	public static int getPentagonalNumber(int n) {
		// n(3n - 1) / 2 * 
		int number = (n * (3 * n - 1) / 2);
		return number;
	}

	public static void printNumbers() {
		int counter = 1;
		for(int i = 0; i < 100; i++) {
			if(counter < 10) {
				System.out.print(getPentagonalNumber(i) + " ");
				counter++;
			} else {
				System.out.println(getPentagonalNumber(i) + " ");
				counter = 1;
			}
		}
	}

	public static void main(String[] args) {
		// System.out.println(getPentagonalNumber(2));
		printNumbers();
	}

}
