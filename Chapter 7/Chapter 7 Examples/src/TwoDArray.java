import java.util.*;

public class TwoDArray {

	public static void main(String[] ars) {
		// 2-D arrays
		int[][] matrix1 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		int[][] matrix2 = new int[2][3];
		/*
		for(int row = 0; row < matrix2.length; row++) {
			for(int col = 0; col < )
		}
		
		Random random = new Random();
		*/
		
		for(int i = 0; i < matrix1.length; i++) {
			for(int a = 0; a < matrix1[i].length; a++) {
				System.out.println(matrix1[i][a]);
			}
		}
		// System.out.println(matrix1[0]);
	}
}
