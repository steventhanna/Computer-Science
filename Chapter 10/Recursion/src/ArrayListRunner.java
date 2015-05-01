
public class ArrayListRunner {
	
	
	
	// find 8 factorial
	// 8! = 8 * 7 * 6 ... * 1
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	

	
	public static int fib(int index) {
		if(index == 0) {
			return 0;
		}
		if(index == 1) {
			return 1;
		}
		
		return fib(index - 1) + fib(index-2); 
		
		
	}
	
	public static void main(String[] args) {
//		for(int i = 0; i < 3; i++) {
//			System.out.println(factorial(i));
//		}
//		System.out.println(factorial(3));
		
		System.out.println(fib(6));
		
	}

}
