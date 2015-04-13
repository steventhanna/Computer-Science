
public class WorkingWithStrings {

	public static void main(String[] args) {
		// All strings are immutable objects
		// Objects cannot be changed
		
		// Literal strings
//		String s1 = "Hello world";
//		s1 = "Hello world again";

		// String constructor
//		String s2 = new String("Constructer String");
		String s3 = "Literal String";
		// System.out.println(s4 == s3);


		String myString = "Eddie is ethnic and he hates that word";
		int len = myString.length();
		char ch = myString.charAt(len - 4);
		System.out.println(ch);

		// substrings
		// Methods that create new Strings
		String s10 = myString.substring(4);
		System.out.println(s10);

		String otherString = " not ";
		System.out.println(myString.substring(0, 9) + otherString + myString.substring(9));
		
		String s1 = "abcdf";
		String s2 = "abf";
		int x = s1.compareTo(s2);
		System.out.println(x);

	}

}
