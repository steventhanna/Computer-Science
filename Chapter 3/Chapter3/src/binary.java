
public class binary {

	private static String[] values = new String[10];
	private static int[] convertedValues = new int[10];
	
	public static void convertBinary() {
		for(int i=0; i<values.length; i++) {
			int decimalValue = Integer.parseInt(values[i], 2);
			convertedValues[i] = decimalValue;
		}
		convertChar();
	}
	
	public static void convertChar() {
		for(int i=0; i<convertedValues.length; i++) {
			System.out.println((char)convertedValues[i]);
		}
	}
	
	public static void main(String[] args) {
		values[0] = "01001000";
		values[1] = "01000101";
		values[2] = "01001100";
		values[3] = "01001100";
		values[4] = "01001111";
		values[5] = "01001111";
		values[6] = "01001111";
		values[7] = "01001111";
		values[8] = "01001100";
		values[9] = "01000100";
		
		convertBinary();
	}
	
}
