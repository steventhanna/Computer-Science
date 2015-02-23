public class Array {

	/**
	 * Hello
	 * @param x 
	 * @param y
	 */
	public static void myMethod(int x, int[] y) {
		// take x and add 1
		// add 1 to every element in array
		x++;

		for(int i = 0; i < y.length; i++) {
			y[i]++;
		}

	}


	public static void main(String[] args) {
		int[] myArray = {9, 8, 7, 6};

		String[] names = {"Tim", "John", "Petar", "Mitch"};
		
		// Enhanced for-loop, for-each loop
		// For-each cannot change anything in the loop 
		for(int a : myArray) {
			System.out.println(a);			
		}
		
		for(String j : names) {
			System.out.println(j);
		}
		
		int m = 15;
		int[] array = {1, 2, 9, 10};
		myMethod(m, array);
		
		// Primitive data types are copied by value i.e. ints, etc.
		// Objects get passed by reference
		System.out.println("m is " + m); // 15
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
}
 