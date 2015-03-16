/**
 * @author steventhanna
 * @class Program3
 * @date 3/15/15
 * @description Write a method that finds the product of two matrices 
 * of integers using the following header:
 */
public class Program3 {
	
	public static int[][] multiplyMatricies(int[][] m, int[][] n) {
		/*
		int[][] result = new int[][]; 
		
		for (int i = 0; i < aRows; i++) { // aRow
	            for (int j = 0; j < bColumns; j++) { // bColumn
	                for (int k = 0; k < aColumns; k++) { // aColumn
	                    C[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }
		
		*/
		Matrix a = new Matrix(m);
		Matrix b = new Matrix(n);
		int[][] result = Matrix.mulitiplyMatrix(a, b);
		return result;
		
		
	}
	
	public static boolean canBeMultiplied(int[][] m, int[][] n) {
		Matrix a = new Matrix(m);
		Matrix b = new Matrix(n);
		return Matrix.canMultiply(a, b);
	}
	
	public static void main(String[] args) {
		int[][] one = {
				{1, 4, 6}
		};
		int[][] two = {
				{2, 3},
				{5, 8},
				{7, 9}
		};
		int[][] result = multiplyMatricies(one, two);
		Matrix.printMatrix(result);
	}
}
