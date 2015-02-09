import java.util.*;
import java.awt.*;
public class RandomLetters {

	public static int generateRandomNumber(int lowerBounds, int upperBounds) {
		int newBounds = 0;
		if(lowerBounds > upperBounds) {
			newBounds = lowerBounds - upperBounds;
		} else {
			newBounds = upperBounds - lowerBounds;
		}
		Random randy = new Random(newBounds);
		double number = randy.nextDouble();
		return (int) (number + lowerBounds);
	}
	
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	public static char randomChar(char ch1, char ch2) {
		int number = generateRandomNumber((int)(ch1), (int)(ch2));
		return (char) number;
				
	}
	
	public static char getRandomLowerCase() {
		return randomChar('a', 'z');
	}
	
	public static char getRandomUpperCase() {
		return randomChar('A', 'Z');
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Random char
		// System.out.println(randomChar('a', 'c'));
		System.out.println(getRandomLowerCase());
		System.out.println(getRandomUpperCase());
	}

}
