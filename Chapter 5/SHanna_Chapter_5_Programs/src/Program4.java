
public class Program4 {

	public static void computeSeries(int n) {
		int number = n;
		double total = 0.0;
		int numberCounter = n;
		for(int i = 0; i < numberCounter; i++) {
			double num = (number / (number + 1));
			number--;
			total += num;
		}
		System.out.println(total);
	}
	
	public static void printResults() {
		double value = 0;
      	System.out.println("i" + "\t\t" +  "m(i)");
      	System.out.println("-------------------");
      	for( int i = 0; i < 21; i++) {
         	System.out.println( i + " \t\t " + value + "\n" );
        	value += ((double) i + 1)/(i+2);
      	}
	}

	public static void main(String[] args) {
		computeSeries(20);
		printResults();
	}
}
