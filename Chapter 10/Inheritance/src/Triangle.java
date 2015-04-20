
public class Triangle {

	private int side1;
	private int side2;
	private int side3;
	private String type = "Generic Triangle";
	
	public Triangle(int a, int b, int c) {
		// Check to make sure sides = triangle
		if(isTriangle(a, b, c)) {
			side1 = a;
			side2 = b;
			side3 = c;
		} else {
			throw (new IllegalArgumentException("Sides do no equate to a trinalge"));
		}
	}
	
	public Triangle(Triangle tri) {
		this(tri.side1, tri.side2, tri.side3);
	}
	
	public static boolean isTriangle(int side1, int side2, int side3) {
		return (side1 + side2) > side3 && (side2 + side3) > side1 && (side3 + side1) > side2;
	}
	
	public static void main(String[] args) throws Exception {
		Triangle test = new Triangle(3, 4, 5);
		Triangle tester = new Triangle(1, 14, 1514);
	}
	
	public void setSide1(int side) {
		side1 = side;
	}
	
	public void setSide2(int side) {
		side2 = side;
	}
	
	public void setSide3(int side) {
		side3 = side;
	}
	
	public int getSide1() {
		return side1;
	}
	
	public int getSide2() {
		return side2;
	}
	
	public int getSide3() {
		return side3;
	}
	
	public int getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public double getArea() {
		double sp = getPerimeter() / 2.0;
		return Math.sqrt(sp * (sp - side1) * (sp - side2) * (sp - side3));
	}
	
}
