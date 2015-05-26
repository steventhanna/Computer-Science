import java.util.*;
import java.awt.*;

import javax.swing.*;

public class Minesweeper {

	private int[][] field = new int[10][10];
	
	public Minesweeper() {
		buildWindow();
	}
	
	public void buildWindow() {
		JFrame frame = new JFrame("Binary");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gridLayout(frame);
		frame.setVisible(true);
	}
	
	public void generateField() {
		Random random = new Random();
		for(int i = 0; i < field.length; i++) {
			for(int a = 0; a < field[i].length; a++) {
				field[i][a] = random.nextInt(5);
			}
		}
	}
	
	public void gridLayout(JFrame frame) {
		GridLayout layout = new GridLayout(10, 10);
		frame.setLayout(layout);
		for(int i = 0; i < 100; i++) {
			JButton button = new JButton("");
			button.setBackground(Color.BLACK);
			frame.add(button);
		}
		
	}
	
	public static void main(String[] args) {
		Minesweeper s = new Minesweeper();
	}
	
	
	
	

}
