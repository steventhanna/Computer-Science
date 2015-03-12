
public class WorkingWith2D {

	// calculate which row has largest sum
	public static double largestRowSum(double[][] array) {
		double[] sum = new double[array.length];
		
		for(int i = 0; i < sum.length; i++) {
			sum[i] = 0;
		}
		for(int i = 0; i < sum.length; i++) {
			for(int a = 0; i < array[i].length; a++) {
				sum[i] += array[i][a];
			}
		}
		// find id of max
		double maxSum = sum[0];
		int id = 0;
		for(int i = 0; i < sum.length; i++) {
			if(sum[i] > maxSum) {
				maxSum = sum[i];
				id = i;
			}
		}
		return id;
	}
	
	public static void main(String[] args) {
		double[][] table = {
				{0.5, 5.5, -3.2},
				{1.2, 0.9, -4.1},
				{5.9, 0.9, -1.1},
		};
		System.out.println(largestRowSum(table));
	}
}
