public class BinarySearch {

	private int[] list;
	
	public BinarySearch(int[] a) {
		list = new int[a.length];
		for(int i = 0; i < list.length; i++) {
			list[i] = a[i];
		}
	}

	public void printArray() {
		for(int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public int binarySearch(int key) {
		int low = 0;
		int high = list.length - 1;

		while(high >= low) {
			int mid = (low + high) / 2;
			if(key < list[mid]) {
				high = mid - 1;
				System.out.println(key + " does not equal list[" + mid + "], " + list[mid]);
			} else if(key == list[mid]) {
				System.out.println(key + " does equal list[" + mid + "], " + list[mid]);
				return mid;
			} else {
				low = mid + 1;
				System.out.println(key + " does not equal list[" + mid + "], " + list[mid]);
			}
		}
		return -low -1; // now high < low
	}
}