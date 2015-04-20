
public class RightTriangle extends Triangle {

	// If you are to call a super constructor, it must 
	// be in the first line of code
	public RightTriangle(int side1, int side2, int side3) {
		super(side1, side2, side3);
	}
	
	public boolean isRightTriangle(int s1, int s2, int s3) {
		int large = Math.max(s1, Math.max(s2, s3));
		int min = Math.min(s1, Math.min(s2, s3));
//		return Math.pow(s1, 2) + Math.pow(s2, 2) == 
	}

}
