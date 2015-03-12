/**
 * @author steventhanna
 * @class Program4
 * @date 3/12/15
 * @description Write a method that returns the value of the largest positive 
 * element in a 2-D array, or 0 if all its elements are negative
 *
 */

public class Program4 {

	/**
	 * @param double[][] m - array of arrays to get max 
	 * @return double - return max number if max > 0
	 * else return -1
	 */
	private static double positiveMax(double[][] m) {
		double max = m[0][0];
		for(int i = 0; i < m.length; i++) {
			for(int a = 0; a < m[i].length; a++) {
				if(m[i][a] > max) {
					max = m[i][a];
				}
			}
		}
		if(max > 0) {
			return max;
		} else {
			return -1;
		}
	}
}
