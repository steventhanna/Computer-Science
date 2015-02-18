/**
* @author Steven Hanna
* @class Program4.java
* @date 2/9/15
* @description Write a method to compute a series of numbers.  Write a test program
* to print out the following table
*/

public class Program4 {

	/**
	* Compute the given series
	* @param int n - in regards to N in the series
	* @return double - total of computed series
	*/
	public static double computeSeries(double n) {
		n += 1;
		double total = 0;
		for(double i = 0; i < n; i++) {
			double result = (i / (i + 1.0));
			total += result;
		}
		return total;
		// System.out.println(total);
	}
	/**
	* Prints the results, along with a table.
	*/
	public static void printResults() {
      	System.out.println("i" + "\t\t" +  "m(i)");
      	System.out.println("-------------------");
      	for(int i = 1; i < 21; i++) {
         	// Round as per specifications
      		double value = (double) Math.round(computeSeries(i) * 10000) / 10000;
         	System.out.println(i + " \t\t " + value + "\n" );
      	}
	}

	public static void main(String[] args) {
		printResults();
	}
}
