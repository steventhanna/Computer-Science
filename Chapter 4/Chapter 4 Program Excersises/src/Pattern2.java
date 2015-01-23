
public class Pattern2 {

	public static void main(String[] args) {
		String s = "*";
		for(int i=0; i<=7; i++) {
			System.out.println();
			for(int k=6; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(s);
			}
		}

	}

}
