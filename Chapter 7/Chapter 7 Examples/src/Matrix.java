/**
* @author Steven T Hanna
* @date 3/10/15
* @class Matrix
* @description create and modify matricies and scalars
*/

public class Matrix {

	/**
	* Amount of rows for the matrix object
	*/
	private int rows;
	/**
	* Amount of columns for the matrix object
	*/
	private int columns;
	/**
	* Houses the data provided through the constructor
	*/
	private int[][] data = new int[rows][columns];
	
	/**
	* Constructor for the Matrix class
	* @param int[][] a - array of arrays that holds the matrix data
	*/
	public Matrix(int[][] a) {
		// this. represents the instance vars of the object
		amountOfRows = a.length;
		this.rows = a[0].length;
		this.columns = a[1].length;
		data = a;
	}
	
	/**
	* Determines whether or not two Matrix objects can be successfully added or subtracted
	* The number of rows of Matrix A and of Matrix B must ==.  Same for columns
	* @param Matrix a - First matrix to determine eligibility
	* @param Matrix b - Second matrix to determine eligibility
	* @return boolean - true: can be added or subtracted, false: cannot be added or subtracted
	*/
	public static boolean canBeAddedOrSubtracted(Matrix a, Matrix b) {
		if(a.rows == b.rows && a.columns == b.columns) {
			return true;
		} else {
			return false;
		}
	}

	/**
	* Determines whether or not two Matrix Objects can be successfully multiplied
	* The number of columns of Matrix a must == number of rows in Matrix b
	* @param Matrix a - First matrix to determine eligibility
	* @param Matrix b - Second matrix to determine eligibility
	* @return boolean - true: can be multiplied, false: cannot be multiplied
	*/
	public static boolean canMultiply(Matrix a, Matrix b) {
		if(a.columns == b.rows) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	* Adds two Matrix Objects together
	* @param Matrix a - First matrix to add
	* @param Matrix b - Second matrix to add
	* @return int[][] - the added matrix in its new form
	*/
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

	/**
	* Subtracts two Matrix Objects together
	* @param Matrix a - First matrix to subtracts
	* @param Matrix b - Second matrix to subtracts
	* @return int[][] - the added matrix in its new form
	*/
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
	
	/**
	* Multiplies one Matrix Object by an integer scalar
	* @param Matrix a - matrix to multiply by scalar
	* @param int scalar - the scalar that will be doing the multiplying
	* @return int[][] - the multiplied matrix in its new form
	*/
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

	/**
	* Multiplies one Matrix Object by another
	* Determine result: Assume Matrix a is n x m , and Matrix b is m x p.
	* The resulting matrix will be a n x p matrix
	* Method of Multiplication: Dot product - multiply each value in first matrix, by 
	* every value in second matrix.  Add values together.
	* @param Matrix a - First matrix to multiply
	* @param Matrix b - Second matrix to multiply
	* @return int[][] - the multiplied matrix in its new form
	*/
	public static int[][] mulitiplyMatrix(Matrix a, Matrix b) {
		// If A is an n × m matrix and B is an m × p matrix
		// result will be a n x p matrix
		int[][] result = new int[a.rows][b.columns];
		// Go through and add shit
		for(int row = 0; row < a.rows; row++) {
			int total = 0;
			for(int col = 0; col < a.columns; col++) {

			}
		}
	}

	/**
	* Prints out the Matrix object
	*/
	public void printMatrix() {
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < columns; c++) {
				System.out.print(data[r][c] + " ");
			}
			System.out.println();
		}
	}
	/**
	* Prints out the given array of arrays
	* @param int[][] a - array of arrays to print
	*/
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
