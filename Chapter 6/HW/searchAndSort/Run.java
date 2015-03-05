public class Run {
	public static void main(String[] args) {
		// int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		double[] list = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
		// LinearSearch lin = new LinearSearch(list);
		// int x = lin.linearSearch(12);
		// System.out.println(x);
		// BinarySearch bin = new BinarySearch(list);
		// for(int i = 0; i < list.length; i++) {
		// 	int x = bin.binarySearch(i);
		// 	System.out.println("***** " + x);
		// }
		// SelectionSort select = new SelectionSort(list);
		InsertionSort insert = new InsertionSort(list);
		insert.insertionSort();
	}
}