public class LinearSearch {

	private int[] list;

	public LinearSearch(int[] a) {
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

	public int linearSearch(int key) {
		for(int i = 0; i < list.length; i++) {
			if(key == list[i]) {
				System.out.println(key + "does equal list[" + i + "], " + list[i]);
				return i;
			}
			System.out.println(key + " does not equal list[" + i + "], " + list[i]);
		}
		return -1;
	}
}