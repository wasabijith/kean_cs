package Unit_1_Loops_and_Methods;

public class Scope_Variable 
{
	public static void main(String[] args) 
	{
		int a = 50; 
		int b = 10; 
		
		if (b > 5)
		{
			int c = 4; 
			System.out.println("Value of a: " + a);
		}
		
		int i; 
		
		for (i = 0; i < 3; i++)
		{
			System.out.println(i);
		}
		System.out.println(i);
	}
}
