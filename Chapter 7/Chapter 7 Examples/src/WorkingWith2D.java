import java.util.*;
public class WorkingWith2D {

	public static int[][] generate(int rows, int columns) {
		Random random = new Random();
		int[][] result = new int[rows][columns];
		for(int i = 0; i < result.length; i++) {
			for(int a = 0; a < result[i].length; a++) {
				result[i][a] = random.nextInt(101);
			}
		}
		return result;
	}
	
	public static int[][] shuffle(int[][] array) {
		Random randy = new Random();
		for(int i = 0; i < array.length; i++) {
			for(int a = 0; a < array[i].length; a++) {
				int indexCol = randy.nextInt(a + 1);
				int indexRow = randy.nextInt(i + 1);
				// Swap
				int x = array[i][indexCol];
				array[indexRow][indexCol] = array[i][a];
				array[indexRow][indexCol] = x;
			}
		}
		return array;
	}

	public static int[] fisherYates(int[] array) {
		Random randy = new Random();
		for(int i = 0; i < array.length; i++) {
			int index = randy.nextInt(i + 1);
			// Swap
			int a = array[index];
			array[index] = array[i];
			array[i] = a;
		}
		return array;
	}
	
	public static void printArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int a = 0; a < array[i].length; a++) {
				System.out.print(array[i][a] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {

		int[][] array = generate(20,20);
		for(int i = 0; i < array.length; i++){
			for(int a = 0; a < array[i].length; a++) {
				System.out.print(array[i][a] + " ");
			}
			System.out.println();
		}
		int[][] array2 = shuffle(array);
		System.out.println();
		printArray(array2);
		
	}
}
