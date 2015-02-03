import java.math.BigInteger;

/**
 * 
 * @author steventhanna
 * @class GCD
 * @date 1.30.15
 * @description returns GCD of two integers
 *
 */

public class GCD {
	
	/*public static int greatestCommonDivisor(int a, int b) {
		BigInteger b1 = new BigInteger(BigInteger.valueOf(a));
	    BigInteger b2 = new BigInteger(BigInteger.valueOf(b)); 
	    BigInteger gcd = b1.gcd(b2);
	    return gcd.intValue();
	}*/

	public static int GCD(int a, int b) {
	   if (b==0) return a;
	   return GCD(b,a%b);
	}
	
	
	public static void main(String[] args) {
		// greatestCommonDivisor(20,40);
		System.out.println(GCD(20,40));
	}
}
