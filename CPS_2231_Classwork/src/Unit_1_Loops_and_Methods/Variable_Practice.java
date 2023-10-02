package Unit_1_Loops_and_Methods;

public class Variable_Practice 
{
	public static void main(String[] args)
	{
		// Initialize a variable
		int number1; 
		int number2; 
		
		// Assign values to the initialized variable
		number1 = 45; 
		number2 = 72; 
		
		// Print out number 1
		System.out.println("Number 1 value is: " + number1);
		System.out.println("Number 2 values is: " + number2);
		
		// Augmented variables 
		int i = 38; 
		i += 8; // There is +, -, *, /, %
		System.out.println(i + " ");
		
		// Increment and Decrement operators 
		int k = 5;
		// Post increment
		int a = k++;
		System.out.println("A: " + a);
		// Pre increment
		int b = ++k;
		System.out.println("B: " + b);
		
		// Character Data Type 
		char ch = 'a'; 
		System.out.println(++ch);
		char cb = 85; 
		System.out.println("Corresponding char: " + cb);
	}
	
}
