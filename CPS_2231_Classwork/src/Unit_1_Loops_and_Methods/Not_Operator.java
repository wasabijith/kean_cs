package Unit_1_Loops_and_Methods;

public class Not_Operator 
{
	public static void main(String[] args)
	{
		int value = 3; 
		System.out.println("Is the value greater than 2?: " + (value > 2));
		System.out.println("Using NOT Operator: " + (!(value > 2)));
		
		boolean a = true; 
		boolean b = false; 
		
		System.out.println("Testing AND Operator: " + (a && b));
		System.out.println("Negate AND result using NOT: " + (!(a && b)));
	}
}
