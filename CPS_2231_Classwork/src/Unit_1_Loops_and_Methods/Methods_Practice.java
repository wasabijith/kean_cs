package Unit_1_Loops_and_Methods;
import java.util.*;

public class Methods_Practice 
{
	//	Calculates the sum of all numbers withing a certain range defined by the user
	public static void main(String[] args) 
	{		
		//	Method practice code (user defined methods) 
		int a, b; 
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter two numbers: ");
		a = input.nextInt(); 
		b = input.nextInt(); 
		
		// Invoke the method and receiving the result (sum)
		int result; 
		result = sumFunction(a,b);
		
		//	Print out the result 
		System.out.println("The sum of all numbers within the range: " + result);
		
		//	Invoke the method and receive the result (average)
		int average; 
		average = averageFunction(a,b); 
		
		//	Print out the result 
		System.out.println("The average of the two numbers: " + average);
		
		//	Invoke the method and receive the result (overloaded average)
		averageFunction(a,b); //	two integers as parameters
		averageFunction(); //	no parameters
		averageFunction(a,b,45); //	three integers as parameters
		averageFunction(34.5, 78.5, 55.7); // three doubles as parameters
		
	}
	
	//	User defined methods 
	public static int sumFunction(int a, int b)
	{
		int sum = 0; 
		for(int i = a; i <= b; i++)
		{
			sum += i; 
		}
		return sum; 
	}
	
	//	Create a method to calculate the average of 'a' and 'b'
	public static int averageFunction(int a, int b)
	{
		int average = (a + b)/2; 
		return average; 
	}
	
	// Method overloading (needs to have same return type and modifier but can have different parameters
	public static void averageFunction() 
	{
		float average = (5 + 10)/2; 
		System.out.println("Average of 5 and 10: " + average);
	}
	
	public static void averageFunction(int x, int y, int z)
	{
		int average = (x + y + z);
		System.out.println("Average of x, y, and z: " + average);
	}
	
	public static void averageFunction(double d1, double d2, double d3)
	{
		double average = (d1 + d2 + d3)/3; 
		System.out.println("Average of d1, d2, and d3: " + average);
	}
}
