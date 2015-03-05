public class SelectionSort {

	private double[] list;
	
	public SelectionSort(double[] a) {
		list = new double[a.length];
		list = a;
	}

	public void printArray() {
		for(double i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void selectionSort() {
		for(int i = 0; i < list.length - 1; i++) {
			double currentMin = list[i];
			int currentMinIndex = i;

			for(int j = i + 1; j < list.length; j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
			printArray();
		}
	}
}