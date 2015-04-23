
public class Triangle {
	// instance variables
	private String type = "Generic Triangle"; 
	private int side1; 
	private int side2; 
	private int side3; 
	
	/*public Triangle()
	{
		side1 = 3; 
		side2 = 4; 
		side3 = 5; 
	}*/
	
	public Triangle(Triangle tri) {
		this(tri.side1, tri.side2, tri.side3); 
	}
	
	public Triangle(int side1, int side2, int side3) {
		if(Triangle.isTriangle(side1, side2, side3)) {	
				this.side1 = side1;
				this.side2 = side2; 
				this.side3 = side3;
		} else {
			throw (new IllegalArgumentException("Invalid Side Lengths"));
		}
			 
	}
	
	public void setSide1(int side) {
		side1 = side; // You want test if this is valid.
	}
	
	public void setSide2(int side) {
		side2 = side; // You want test if this is valid.
	}
	
	public void setSide3(int side) {
		side3 = side; // You want test if this is valid.
	}
	
	public int getPerimeter() {
		return side1 + side2 + side3; 
	}
	
	public double getArea() {
		double semiP = getPerimeter() / 2.0; 
		
		return Math.sqrt(semiP * (semiP - side1) * (semiP - side2) 
				* (semiP - side3)); 
	}
	
	public void printType() {
		System.out.println(type);
	}
	
	public void doThis() {
		System.out.println("BOOM! This is stupid");
	}
	
	public static boolean isTriangle(int side1, int side2, int side3)
	{
		return (side1 + side2) > side3 && (side2 + side3) > side1 &&
				(side1 + side3) > side2; 
	}
}
