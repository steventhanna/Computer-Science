
public class PlayingWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Eddie";
		String anotherWord = "is";
		String lastWord = "Ethnic";
		
		
		// String concatenation
		String combo = word + " " + anotherWord + " " + lastWord;
		String concatCombo = word.concat(anotherWord.concat(lastWord));
		
		System.out.println(word);
		System.out.println(combo);
		
		System.out.println("The sentence above has " + combo.length() + " characters");
		
		System.out.println(concatCombo);
		
		System.out.println("The sentence above has " + concatCombo.length() + " characters");
		
		// subString() method
		String differentCombo = combo.substring(0, 9) + "Fun";
		System.out.println(differentCombo);
		
		// toLowerCase() and toUpperCase()
		System.out.println(differentCombo.toUpperCase());
		System.out.println(differentCombo.toLowerCase());
		
		System.out.println(differentCombo + 7);
		
		System.out.println("hello \n my name \t is \t steven");
		
	}

}
