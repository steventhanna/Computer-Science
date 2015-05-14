import javax.swing.*;
import java.awt.*;
import java.util.*;


public class BinaryThing extends JFrame {

	public BinaryThing() {
		buildWindow();
	}
	
	public String generateNumber() {
		Random random = new Random();
		return random.nextInt(2) + "";
	}
	
	
	public void buildWindow() {
		JFrame frame = new JFrame("Binary");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(10,10);
		frame.setLayout(layout);
		for(int i = 0; i < 100; i++) {
			JLabel label = new JLabel(generateNumber());
			label.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
			frame.add(label);	
		}
		
		frame.setVisible(true);
		

		
	}
	
	

	public static void main(String[] args) {
		BinaryThing thing = new BinaryThing();
		

	}

}
