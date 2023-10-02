package Unit_1_Loops_and_Methods;
import java.util.Scanner; 

public class Scanner_Class 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		int number; 
		double d1; 
		float f1; 
		String s1; 
		boolean b1; 

		// Enter in
		System.out.println("Please enter a int: ");
		number = input.nextInt(); 

		System.out.println("You have entered: " + number);

		// Enter double
		System.out.println("Please enter a double: ");
		d1 = input.nextDouble(); 

		System.out.println("You have entered: " + d1);

		// Enter float
		System.out.println("Please enter a float: ");
		f1 = input.nextFloat(); 

		System.out.println("You have entered: " + f1);

		// Enter String
		System.out.println("Please enter a String: ");
		s1 = input.nextLine(); 

		System.out.println("You have entered: " + s1);

		// Enter boolean
		System.out.println("Please enter a boolean: ");
		b1 = input.nextBoolean(); 

		System.out.println("You have entered: " + b1);
	}
}
