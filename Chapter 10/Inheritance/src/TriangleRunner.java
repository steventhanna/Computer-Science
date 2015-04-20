
public class TriangleRunner {

	public static void main(String[] args) 
	{
		Triangle tri1 = new Triangle(3, 5, 6);
		Triangle tri2 = new RightTriangle(20, 21, 29); 
		RightTriangle tri3 = new RightTriangle(5, 12, 13); 
		
System.out.println("First Triangle has an area of: " + tri1.getArea());

System.out.println("Second Triangle has an area of: " + tri2.getArea());

System.out.println("Third Triangle has an area of: " + tri3.getArea());
		
		
		
		

	}

}
