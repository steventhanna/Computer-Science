
public class Changer {
	
	
	public static void doubleTheValue(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] *= 2;
		}
	}
	
	// Create a method that creates a one dimensional array
	// Each element in the array holds the sum of each corresponding row
	// from a two dimensional array parameter
	public static int[] createArrayWithSumOfRows(int[][] matrix) {
		// Create container for sums 
		int[] sums = new int[matrix.length];
		for(int i = 0; i < sums.length; i++) {
			int sum = 0;
			for(int a = 0; a < matrix[i].length; a++) {
				sum += matrix[i][a];
			}
			sums[i] = sum;
		}
		return sums;
	}
	
	public static void main(String[] args) {
		int[][] a = {
				{1, 2, 3, 4},
				{2, 3, 4, 2},
		};
		int[] result = createArrayWithSumOfRows(a);
		for(int i : result) {
			System.out.print(i + " ");
		}
	}

}
