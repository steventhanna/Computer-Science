
public class Matrix {

	private int amountOfRows;
	private int rows;
	private int columns;
	private int[][] data = new int[rows][columns];
	
	public Matrix(int[][] a) {
		// this. represents the instance vars of the object
		amountOfRows = a.length;
		this.rows = a[0].length;
		this.columns = a[1].length;
		data = a;
	}
	
	
	public static boolean canBeAddedOrSubtracted(Matrix a, Matrix b) {
		if(a.rows == b.rows && a.columns == b.columns) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean canMultiply(Matrix a, Matrix b) {
		if(a.columns == b.columns) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static int[][] addMatrix(Matrix a, Matrix b) {
		int[][] result = new int[a.rows][a.columns];
		if(canBeAddedOrSubtracted(a, b)) {
			// Calculate new totals row by row
			for(int i = 0; i < a.rows; i++) {
				for(int j = 0; j < a.columns; j++) {
					result[i][j] = a.data[i][j] + b.data[i][j];
				}
			}
			return result;
		} else {
			return null;
		}
	}
	
	public static int[][] subtractMatrix(Matrix a, Matrix b) {
		int[][] result = new int[a.rows][a.columns];
		if(canBeAddedOrSubtracted(a, b)) {
			// Calculate new totals row by row
			for(int i = 0; i < a.rows; i++) {
				for(int j = 0; j < a.columns; j++) {
					result[i][j] = a.data[i][j] - b.data[i][j];
				}
			}
			return result;
		} else {
			return null;
		}
	}
	
	public static int[][] scalarMultiplyMatrix(Matrix a, int scalar) {
		int[][] result = new int[a.rows][a.columns];
		// Calculate new totals row by row
			for(int i = 0; i < a.rows; i++) {
				for(int j = 0; j < a.columns; j++) {
					result[i][j] = a.data[i][j] * scalar;
				}
			}
			return result;
	}

	
	public void printMatrix() {
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < columns; c++) {
				System.out.print(data[r][c] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(int[][] a) {
		for(int r = 0; r < a.length; r++) {
			for(int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}
	
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
		int[][] add = addMatrix(a, b);
		printMatrix(add);
		
	}
	
	
}
