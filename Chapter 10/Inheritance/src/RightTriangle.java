
public class RightTriangle extends Triangle
{
	private String type = "Right Trianlge"; 
	
	public RightTriangle(int side1, int side2, int side3)
	{
		super(side1, side2, side3); 
		// If you are to call the super constructor
		// it MUST MUST be the first line of code.  
		if(!isRightTriangle(side1, side2, side3))
			throw new IllegalArgumentException("Not a right triangle"); 		
	}
	
	
	public boolean isRightTriangle(int s1, int s2, int s3)
	{
		int large = Math.max(s1, Math.max(s2, s3)); 
		
		if(s1 == large)
			return Math.pow(s2, 2) + Math.pow(s3, 2) == Math.pow(large, 2); 
			
		else if(s2 == large)
			return Math.pow(s1, 2) + Math.pow(s3, 2) == Math.pow(large, 2); 
			
		else 
			return Math.pow(s1, 2) + Math.pow(s2, 2) == Math.pow(large, 2); 
		
		
	}
}
