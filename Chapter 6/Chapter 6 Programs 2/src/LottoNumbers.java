/**
* @author Steven Hanna
* @class LottoNumber
* @description read ticket numbers from command line and determines
* 1 - 99 are used
* @date 2/18/15
*/

import java.util.ArrayList;
import java.util.Scanner;

public class LottoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean[] isCovered = new boolean[100]; // default == fault

		// Read all numbers and mark corresponding id true
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int response = 1;
		while(response != 0) {
			int num = scanner.nextInt();
			numbers.add(num);
			response = num;
		}
		int[] numberArray = new int[numbers.size()];
		for(int i = 0; i < numberArray.length; i++) {
			numberArray[i] = numbers.get(i);
		}
		
		for(int i = 0; i < numberArray.length; i++) {
			isCovered[numberArray[i]] = true;
		}

		// Check if all covered
		boolean allCovered = true; // Assume all true
		for(int i = 0; i < 99; i++) {
			// Find one number not covered
			// Use break statement to exit loop
			if(isCovered[i] == false) {
				allCovered = false;
				break;
			}
		}
		for(int i = 0; i < isCovered.length; i++){
			System.out.print(i + " ");
			System.out.println(isCovered[i]);
		}

		// Display result
		if(allCovered == true) {
			System.out.println("The tickets cover all numbers");
		} else {
			System.out.println("The tickets don't cover all the numbers");
		}
	}
	
}