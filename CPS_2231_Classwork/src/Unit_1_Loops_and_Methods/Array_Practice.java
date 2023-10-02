package Unit_1_Loops_and_Methods;
import java.lang.reflect.Array;
import java.util.*; 

public class Array_Practice {

	public static void main(String[] args) 
	{
		int[] scores; 
		scores = new int[5];	// integer size of 5 
		
		scores[0] = 45;	// first element
		scores[1] = 20;	// second element
		scores[2] = 89;	// third element
		scores[3] = 56;	// fourth element
		scores[4] = 80;	// fifth element
		
		System.out.println("The length of the array is: " + scores.length);
		System.out.println("The value at index 0 is: " + scores[0]);
		
		//	Find the maximum value in the array 
		int max = scores[0]; 
		for(int i = 1; i < scores.length; i++)	
		{
			if(scores[i] > max)
			{
				max = scores[i]; 
			}
		}
		System.out.println("The maximum element is: " + max);
		
		// Create an integer array and fill in with user input 
		int[] age; 
		age = new int[5];	// integer array with size of 5 
		
		Scanner input = new Scanner(System.in); 
		
		for(int i = 0; i < age.length; i++)
		{
			System.out.println("Please enter an age");
			age[i] = input.nextInt(); 
		}
		
		for (int j = 0; j < age.length; j++)
		{
			System.out.println("The age at index " + j + " is: " + age[j]);
		}
		
		// Abi's notes: 
		// You don't need 2 for loops do to this. It's really inefficient and the professor be wylin so just do it in one and save time
	
		//	Calculate the sum of all elements in the array 
		int sum = 0; 
		for(int i = 0; i < age.length; i++)
		{
			sum += age[i]; 
		}
		System.out.println("Sum of all elements: " + sum);
	}

}
