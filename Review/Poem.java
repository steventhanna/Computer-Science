/**
* @author Steven T Hanna
* @date 5/4/15
* @class Poem - abstract class for a series of Poems
*/
public abstract class Poem {

	/**
	* @return int number of lines in the poem
	*/
	public abstract int numbLines();

	/**
	* @param Kth line to return syllables in
	* @return returns number of syllables
	*/
	public abstract int getSyllables(int k);

	/**
	* prints rhythm of each line
	*/
	public void printRhythm() {
		// Call getSyllables for all lines
		for(int i = 0; i < numbLines(); i++) {
			int syl = getSyllables(i);
			for(int a = 0; a < syl; a++) {
				System.out.print("ta");
			}
			System.out.println("");
		}
	}

	/**
	 * Get the number of syllables for a given word
	 * @param s the given word
	 * @return the number of syllables
	 */
	public static int getNumberOfSyllablesPerWord(String s) {
	    s = s.trim();
	    if (s.length() <= 3) {
	        return 1;
	    }
	    s = s.toLowerCase();
	    s = s.replaceAll("[aeiouy]+", "a");
	    s = "x" + s + "x";
	    return s.split("a").length - 1;
	}

}