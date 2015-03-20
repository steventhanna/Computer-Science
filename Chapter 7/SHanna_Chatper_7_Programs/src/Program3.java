/**
 * @author steventhanna
 * @class Program3
 * @date 3/15/15
 * @description Write a method that finds the product of two matrices 
 * of integers using the following header:
 */
public class Program3 {
	
	public static int[][] multiplyMatricies(int[][] m, int[][] n) {
		Matrix a = new Matrix(m);
		Matrix b = new Matrix(n);
		int[][] result = a.mulitiplyMatrix(b);
		return result;
	}
	
	public static boolean canBeMultiplied(int[][] m, int[][] n) {
		Matrix a = new Matrix(m);
		Matrix b = new Matrix(n);
		return a.canMultiply(b);
	}
	
	public static void main(String[] args) {
		int[][] one = {
				{4, 8},
				{0, 2},
				{1, 6},
				{1, 6},
				{1, 6}
		};
		int[][] two = {
				{5, 2},
				{9, 4},
				{1, 6}
		};
		
		Matrix a = new Matrix(one);
		Matrix b = new Matrix(two);
		System.out.println(a.canMultiply(b));
		int[][] result = a.mulitiplyMatrix(b);
		// int[][] result = multiplyMatricies(one, two);
		Matrix.printMatrix(result);
	}
}
