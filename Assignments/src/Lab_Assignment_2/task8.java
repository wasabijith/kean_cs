/******************************************************************************* 
 * Kean University 
 * Semester Fall 22  
 * Course: CPS*2231 - Computer Programming 
 * Author(s): Abijith Manikandan CPS*2231 Section 01
 * Lab: 2 
 * Task: 8 
 * Program Description: Reports the minimum of provided integers provided from the user when prompted using Scanner class. Uses an overloaded method to simplify the process 
 ********************************************************************************/ 
package Lab_Assignment_2;

import java.util.Scanner;

public class task8 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter the number of integers 
		System.out.println("Enter the number of integers you will provide: ");
		int num = input.nextInt();
		
		//Prompt the user to enter the first integer 
		System.out.println("Enter the value for 'a' and press Enter: ");
		int a = input.nextInt(); 

		//Prompt the user to enter the second integer 
		System.out.println("Enter the value for 'b' and press Enter: ");
		int b = input.nextInt(); 
		
		if (num == 2)
		{
			System.out.printf("Provided Integers: %4d and %4d, the minimum is %5d\n", a, b, MinTest(a, b));		
		}
		
		else if(num == 3)
		{
			//Prompt the user to enter the third integer 
			System.out.println("Enter the value for 'c' and press Enter: ");
			 int c = input.nextInt();
			System.out.printf("Provided Integers: %4d and %4d and %4d, the minimum is %5d\n", a, b, c, MinTest(a, b, c));		
		}

		else if(num == 4)
		{
			//Prompt the user to enter the third integer
			System.out.println("Enter the value for 'c' and press Enter: ");
			int c = input.nextInt();
			//Prompt the user to enter the fourth integer 
			System.out.println("Enter the value for 'd' and press Enter: ");
			int d = input.nextInt();
			System.out.printf("Provided Integers: %4d and %4d and %4d and %4d, the minimum is %5d\n", a, b, c, d, MinTest(a, b, c, d));		
		}		
	}
	public static int MinTest(int num1, int num2)
	{
		return Math.min(num1, num2);
	}
	
	public static int MinTest(int num1, int num2, int num3)
	{
		return Math.min(Math.min(num1, num2), num3); 
	}
	
	public static int MinTest(int num1, int num2, int num3, int num4)
	{
		return Math.min(Math.min(num1, num2), Math.min(num3, num4)); 
	}
}
