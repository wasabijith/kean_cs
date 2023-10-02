package Unit_1_Loops_and_Methods;

import java.util.Scanner;

public class Sentinel_Value 
{
	public static void main(String[] args)
	{
		// Create a scanner 
		Scanner input = new Scanner(System.in); 
		
		// Read initial data 
		System.out.println("Enter an integer (the input ends if it is 0): ");
		int data = input.nextInt(); 
		
		// Keep reading data until the input is 0 
		int sum = 0; 
		while (data != 0)
		{
			sum += data; 
			
			// Read the next data 
			System.out.println("Enter an integer (the input ends if it is 0): "); 
			data = input.nextInt(); 
		} 
		
		System.out.println("The sum is: " + sum);
	}
}
