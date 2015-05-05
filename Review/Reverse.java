/**
* @author Steven T Hanna
* @date 5/4/15
* @class Reverse - Tests to see if a matrix is reversed of another
*/

public class Reverse {

	public static boolean isReverse(int[][] a, int[][] b) {
		boolean reverse = false;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				// Check if array one is equal to array 2
				if(a[i][j] == b[b.length - 1 - i][b[i].length - 1 - j]) {
					reverse = true;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] a = {
			{1, 2, 3, 4},
			{1, 2, 3, 4}
		};
		int[][] b = {
			{4, 3, 2, 1},
			{4, 3, 2, 1}
		};

		System.out.println(isReverse(a, b));
	}
}