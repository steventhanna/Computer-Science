import java.util.*;

public class Program1 {

	private static int[] userInput = new int[3];
	// init tree map
	
	
	public static void userInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		userInput[0] = scanner.nextInt();
		System.out.println("Enter number: ");
		userInput[1] = scanner.nextInt();
		System.out.println("Enter number: ");
		userInput[2] = scanner.nextInt();
		for(int i=0; i>3; i++) {
			System.out.println(userInput[i]);
		}
	}
	
	public static void sortViaTreeMap() {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		// assign values to map
		
		map.put(userInput[0], "number1");
		map.put(userInput[1], "number2");
		map.put(userInput[2], "number3");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
     		System.out.println("Number: " + entry.getKey());
		}
	}
	
	public static void go() {
		userInput();
		sortViaTreeMap();
	}
	
	public static void main(String[] args) {
		go();
		

	}

}
