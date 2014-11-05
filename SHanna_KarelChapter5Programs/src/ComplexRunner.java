/*
 * Steven Hanna
 * Runner for complexRunner objective
 */
import kareltherobot.*;

public class ComplexRunner extends ComplexCarpenter{

	public ComplexRunner(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		
	}

	public static void main(String[] args) {
		World.setDelay(20);
		World.setVisible(true);
		World.readWorld("world4.kwld");
		
		ComplexRunner karel = new ComplexRunner(1,1,North,infinity);
		
		karel.go();
		
	}

}
