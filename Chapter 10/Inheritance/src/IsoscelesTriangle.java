
public class IsoscelesTriangle extends Triangle {
	
	private String type = "Isoseles Triangle";
	
	public IsoscelesTriangle(int s1, int s2) {
		super(s1, s1, s2);
	}
	
	@Override
	public void printType() {
		System.out.println(type);
	}

}
