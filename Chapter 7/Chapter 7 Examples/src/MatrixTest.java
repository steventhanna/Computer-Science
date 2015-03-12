
public class MatrixTest {
	
	public static void main(String[] args) {
		int[][] test1 = new int[5][5];
		int[][] test2 = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			for(int a = 0; a < 5; a++) {
				test1[i][a] = a;
				test2[i][a] = a;
			}
		}
		
		Matrix a = new Matrix(test1);
		Matrix b = new Matrix(test2);
		int[][] add = Matrix.addMatrix(a, b);
		Matrix.printMatrix(add);
		
	}

}
