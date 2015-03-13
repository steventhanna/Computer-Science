
public class NestedForEachLoop {

	public static double exampleOne(double[][] array) {
		double sum = 0;
		
		for(double[] a : array) {
			for(double j : a) {
				sum += j;
			}
		}
		return sum;
	}
	
	public static void exampleTwo(double[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int a = 0; a < array[i].length; a++) {
				array[i][a] += 0.5;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		// Nested for each loop
		int[][] array = new int[5][5];
		for(int[] row: array) {
			for(int u: row) {
				System.out.println(u + " ");
			}
			System.out.println();
		}

	}

}
