public class ListArray {

	public static void main(String[] args) {
		int[] list = new int[10];
		// add stuff to int
		for(int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		int temp1 = list[list.length - 1];
		int temp2 = list[list.length - 2];
		int[] listTemp = new int[list.length];
		listTemp[0] = temp2;
		listTemp[1] = temp1;
		System.out.println(" ");
		for(int i = 2; i < list.length - 1; i++) {
			listTemp[i] = list[i-2];
		}
		list = listTemp;
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}


	}
}