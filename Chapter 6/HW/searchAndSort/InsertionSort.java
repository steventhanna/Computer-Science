public class InsertionSort {
	private double[] list;
	
	public InsertionSort(double[] a) {
		list = new double[a.length];
		list = a;
	}

	public void insertionSort() {
		for(int i = 1; i < list.length; i++) {
			double currentElement = list[i];
			int k;
			for(k = i - 1; k >= 0 && list[k] > currentElement; k--) {
				list[k + 1] = list[k];
			}
			list[k + 1] = currentElement;
			printArray();
		}
		
	}

	public void printArray() {
		for(double i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}