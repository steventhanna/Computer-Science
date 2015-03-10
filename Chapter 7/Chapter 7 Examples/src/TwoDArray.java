import java.util.*;

public class TwoDArray {

	public static void main(String[] ars) {
		// 2-D arrays
		int[][] matrix1 = {
				{1, 2, 3, 7, 9},
				{4, 5, 6, 9, 5}
		};
		
		System.out.println(matrix1[1][3]);
		int[][] matrix2 = new int[matrix1[0].length][matrix1[1].length];
		
		matrix2[0][0] = 6;
		matrix2[0][1] = 12;
		matrix2[0][2] = 1;
		matrix2[0][3] = 7;
	}
}
