import java.awt.*;
import java.io.*;
import java.util.*;

public class RandomComment {

	// Random word
	public String randomWord() throws IOException {
		String filename = "../the-english";
		ArrayList<String> wordlist = new ArrayList<String>();
		Random randy = new Random();
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		while(in.ready()) {
			wordlist.add(in.readLine());
		}
		in.close();
		
		String randomWord = wordlist.get(randy.nextInt(wordlist.size()));
		return randomWord;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
