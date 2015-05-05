import java.util.*;

public class Test {


	public static String mince(String str) {
		int n = str.length() / 3;
		if(n >= 1) {
			str = mince(str.substring(2 * n)) + mince(str.substring(n, n * n)) + mince(str.substring(0, n));
		}
		return str;
	}
	
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
//		int x = 1;
		
//		boolean t = test.add(123.123);
//		boolean a = test.add(123.123);
//		test.get(test.size());
//		test.add(test.size(), 0.0);
		test.add("pigs");
		test.add(1, "cows");
		test.add(1, "sheep");
		
//		test.remove(0.0);
		System.out.println(test.toString());
//		System.out.println(test.add(test.size(), 0.0));
//		System.out.println(a);
//		System.out.println(String.valueOf(99));
		
	}
}
