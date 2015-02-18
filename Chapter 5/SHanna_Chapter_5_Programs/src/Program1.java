/**
* @author Steven Hanna
* @class Program1
* @date 2/9/15
* @description Write a program that displays the first 100 pentgonal numbers with 10 numbers on each line
*/
public class Program1 {

	/**
	* Get a pentagonal number
	* @param n integer
	* @return integer
	*/
	public static int getPentagonalNumber(int n) {
		// n(3n - 1) / 2 * 
		int number = (n * (3 * n - 1) / 2);
		return number;
	}
	/**
	* Print out the first 100 numbers 10 per line
	*/
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
