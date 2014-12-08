import java.util.*;

public class calculator2
{

	public static void main(String[] args)
	{
		//This code should be place inside the main method of a class

		System.out.println("  A. Addition"); 
		System.out.println("  S. Subtraction");
		System.out.println("  M. Multiplication");
		System.out.println("  D. Division\n");

		System.out.print("  Your Choice? "); 

		Scanner reader = new Scanner(System.in);
		String choice = reader.nextLine(); 

		// char choice; // You would think this would work...but it doesn't
		char ch = choice.charAt(0); // You just learned another String method. 

		System.out.print("\nEnter first operand: ");
		double op1 = reader.nextDouble(); 

		System.out.print("\nEnter second operand: "); 
		double op2 = reader.nextDouble(); 

		System.out.println(""); 
		reader.close();

		switch(ch)
		{
			case 'A': //addition
			case 'a':
				System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2) );
				break;
			case 'S': //subtraction
			case 's':
				System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2) );
				break;
			case 'M': //multiplication
			case 'm':
				System.out.println(op1 + " times " + op2 + " = " + (op1 * op2) );
				break;
			case 'D': //division
			case 'd':
				System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2) );
				break;
			default:
				System.out.println("Hey dummy, enter only a A, S, M, or D!");
		}
	}
}

