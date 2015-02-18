import java.io.*;
import java.util.*;

public class LottoNumbers {

	private String filename;
	private ArrayList<String> numbersString = new ArrayList<String>();
	private int[] numbers;
	private boolean[] listToCheck = new boolean[100];
	
	public LottoNumbers(String file) {
		filename = file;
	}

	public void readLottoTicket() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		while(in.ready()) {
			String num = in.readLine();
			String[] nums = num.split("\\s");
			for(int i = 0; i < nums.length; i++) {
				numbersString.add(nums[i]);
			}
		}
		in.close();
	}

	public void stringToInt() {
		numbers = new int[numbersString.size()];
		for(int i = 0; i < numbers.length; i++) {
			String numToChange = numbersString.get(i);
			numbers[i] = Integer.parseInt(numToChange);
		}
	}

	public boolean checkValidity() throws IOException {
		readLottoTicket();
		stringToInt();
		for(int i = 0; i < numbers.length; i++) {
			listToCheck[numbers[i]] = true;
		}
		boolean valid;
		for(int i = 0; i < listToCheck.length; i++) {
			if(listToCheck[i] = true) {
				valid = true;
			} else {
				valid = false;
				break;
			}
		}
		if(valid = true) {
			return true;
		} else {
			return false;
		}
	}

	public void go() throws IOException {
		if(checkValidity() == false) {
			System.out.println("The ticket covers all numbers");
		} else {
			System.out.println("The tickets don't cover all the numbers");
		}
	}

	public static void main(String[] args) throws IOException {
		LottoNumbers ticket = new LottoNumbers("lotto.txt");
		LottoNumbers ticket2 = new LottoNumbers("lotto2.txt");
		ticket.go();
		ticket2.go();
	}
	
}