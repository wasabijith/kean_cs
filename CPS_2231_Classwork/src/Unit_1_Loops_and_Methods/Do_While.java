package Unit_1_Loops_and_Methods;

public class Do_While 
{
	public static void main(String[] args) 
	{
		int x = 21; 
		do 
		{
			// The line will be printed even if the condition is false 
			System.out.println("Value of x is: " + x);
			x++; 
		}
		
		while (x < 20); // If this is true then it executes the statement inside the do block
	}
}
