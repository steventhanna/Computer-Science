import java.io.*;
import java.util.*;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class Converter {

	public static String getHex(String input) throws IOException {
		String filename = input;
		ArrayList<String> hexCode = new ArrayList<String>();
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		while(in.ready()) {
			hexCode.add(in.readLine());
		}
		in.close();
		
		String resultant = hexCode.toString();
		return resultant;
	}
	
	public static void exportHex(String export) throws IOException {
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(export, true)))) {
			out.println(export);
		} catch(IOException e) {
			// exception handling left as an exercise to the reader
			System.out.println("Error " + e);
		}
	}
	
	public static void convertHex() throws IOException, DecoderException {
		// String hex2String = getHex("/Users/steventhanna/Desktop/hex.txt");
		String hex2String = "c5d0 d3c6 2000 0000 4be7 0e00 0000 0000 0000 0000 6be7 0e00 7f56 0300 ffff 0000";
		String hexString = hex2String.replaceAll("//s", "");
		// Start the conversion
//		byte[] bytes = Hex.decodeHex(hexString.toCharArray());
//		String completedHex = new String(bytes, "UTF-8");
//		exportHex(completedHex);
		StringBuilder output = new StringBuilder();
		for(int i=0; i < hexString.length(); i+=2) {
			String str = hexString.substring(i, i+2);
			output.append((char)Integer.parseInt(str, 16));
		}
		String completed = output.toString();
		exportHex(completed);
		
	}
	
	public static void main(String[] args) throws IOException, DecoderException {
		convertHex();
	}
	
}
