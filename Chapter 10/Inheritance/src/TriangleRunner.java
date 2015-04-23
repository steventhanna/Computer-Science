
public class TriangleRunner {

	public static void main(String[] args) {
		Triangle tri1 = new Triangle(3, 5, 6);
		Triangle tri2 = new RightTriangle(20, 21, 29); 
		RightTriangle tri3 = new RightTriangle(5, 12, 13); 
		Triangle tri4 = new IsoscelesTriangle(10,10);
		IsoscelesTriangle tri5 = new IsoscelesTriangle(10,10);
		
		System.out.println("First Triangle has an area of: " + tri1.getArea());
		
		System.out.println("Second Triangle has an area of: " + tri2.getArea());
		
		System.out.println("Third Triangle has an area of: " + tri3.getArea());
		
		System.out.println(RightTriangle.isTriangle(3, 4, 5));
		tri1.printType();
		tri2.printType();
		tri3.printType();
		tri4.printType();
		tri5.printType();
	}
	
	public static String redEddie(Triangle myTri) {
		if(myTri instanceof RightTriangle) {
			return "Right Triangle";
		} else {
			return "No";
		}
	}

}
 