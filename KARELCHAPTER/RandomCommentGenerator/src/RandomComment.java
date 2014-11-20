import java.awt.*;
import java.io.*;
import java.util.*;

public class RandomComment {

	// Random word
	public static String randomWord() throws IOException {
		String filename = "the-english.txt";
		ArrayList<String> wordlist = new ArrayList<String>();
		Random randy = new Random();
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		while(in.ready()) {
			wordlist.add(in.readLine());
		}
		in.close();
		
		String randomWord = wordlist.get(randy.nextInt(wordlist.size()));
		System.out.println(randomWord);
		return randomWord;
	}
	
	public static void writeComment(String filename) throws IOException {
		String random = randomWord();
		String word = random;
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("filename", true)))) {
			// out.println("//");
			out.println(word);
		} catch (IOException e) {
			System.out.println("help: " + e);
		}
	}
	
	public static String randomSentence() throws IOException {
		Random randy = new Random();
		int randomLength = randy.nextInt(20);
		String[] randomSentence = new String[randomLength];
		String sentence = "";
		for(int i=0; i<randomLength; i++) {
			// randomSentence[i] = randomWord();
			sentence += " " + randomWord();
		}
		// String sentence = randomSentence.toString();
		System.out.println(sentence);
		return sentence;
		
	}
	
	
	public static void export(String export) throws IOException {
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.java", true)))) {
		    out.println(export);
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
			System.out.println("HELP!");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		export("// " + randomSentence());
		// randomSentence();
	}

}
