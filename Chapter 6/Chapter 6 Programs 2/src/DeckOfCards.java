/**
* @author Steven Hanna
* @class DeckOfCards
* @description randomly select four cards from a deck
* @date 2/18/15
*/

import java.util.*;

public class DeckOfCards {

	/**
	* Use the Fisher Yates algorithim to randomize an array
	* @param int[] array - that array to be randomized
	* @return int[] array - the randomized array
	*/ 
	public static int[] fisherYates(int[] array) {
		Random randy = new Random();
		for(int i = 0; i < array.length; i++) {
			int index = randy.nextInt(i + 1);
			// Swap
			int a = array[index];
			array[index] = array[i];
			array[i] = a;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};


		// Initialize cards in deck
		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}

		// Shuffle the cards
		deck = fisherYates(deck);

		// Display the first 4 cards
		for(int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}
}
