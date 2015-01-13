
public class MultiplicationTable {

	public static void createTitle() {
		System.out.println("\t\t\tMultiplication Table");
		System.out.println("\t");
		// Make row title
		for(int j = 1; j<=9; j++) {
			System.out.print("\t" + j);
		}
		System.out.println("\n ----------------------------------------------------------------------------------");
		
		for(int i = 1; i<=9; i++) {
			System.out.println(i + " |");
			
			for(int j=1; j<=9; j++) {
				System.out.print("\t" + i * j);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		createTitle();

	}

}
