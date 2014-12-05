import java.util.*;

public class PlayingWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This code should be place inside the main method of a class
		System.out.println("  1. Addition");
		System.out.println("  2. Subtraction");
		System.out.println("  3. Multiplication");
		System.out.println("  4. Division\n");
		System.out.print("  Your Choice? ");
		Scanner reader = new Scanner(System.in);
		int choice = reader.nextInt();
		System.out.print("\nEnter first operand: ");
		double op1 = reader.nextDouble();
		System.out.print("\nEnter second operand: ");
		double op2 = reader.nextDouble();
		System.out.println("");
		reader.close();
		switch(choice)
		{
		case 1: //addition
		     System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2) );
		     break;
		case 2: //subtraction
		     System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2) );
		     break;
		case 3: //multiplication
		     System.out.println(op1 + " times " + op2 + " = " + (op1 * op2) );
		     break;
		case 4: //division
		     System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2) );
		     break;
		default:
		     System.out.println("Hey dummy, enter only a 1, 2, 3, or 4!");
		}
	}

}
