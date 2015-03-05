import java.util.*;

public class Test2 {
	
	public static int[] generateRandomList(int arrayLength) {
		Random random = new Random();
		int[] temp = new int[arrayLength];
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = random.nextInt(11);
		}		
		return temp;
	}
	
	public static int[] shellSort(int[] array) {
		int increment = array.length / 2;
		while(increment > 0) {
			for(int i = increment; i < array.length; i++) {
				int j = i;
				int temp = array[i];
				while(j >= increment && array[j - increment] > temp) {
					array[j] = array[j - increment];
					j = j - increment;
				}
				array[j] = temp;
			} if(increment == 2) {
				increment = 1;
			} else {
				increment *= (5.0 / 11);
			}
		}
		return array;
	}
	
	// reverse the order of an integer array list
	public static void reverse(int[] array) {
		int[] temp = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		int counter = 0;
		for(int i = array.length-1; i >= 0; i--) {
			array[i] = temp[counter];
			counter++;
		}
	}
	
	public static void main(String[] args) {
		int[] hotDogz = new int[10];
		hotDogz = generateRandomList(hotDogz.length);
		for(int i : hotDogz) {
			System.out.print(i + " ");
		}
		reverse(hotDogz);
		System.out.println("");
		for(int i : hotDogz) {
			System.out.print(i + " ");
		}
		hotDogz = shellSort(hotDogz);
		System.out.println("");
		for(int i : hotDogz) {
			System.out.print(i + " ");
		}
	}

}
