import java.util.*;

public class NestedLoops {

	public static void main(String[] args) {
		Random randy = new Random();
		int random = randy.nextInt(20);
		
		int k = 1;
		for(int i=0; i<random; i++) {
			for(int j=0; k < j; j++) {
				System.out.print("*");
				k++;
			}
			System.out.println("");
		}
	}

}
