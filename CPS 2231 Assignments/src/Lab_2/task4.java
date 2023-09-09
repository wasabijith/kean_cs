/******************************************************************************* 
 * Kean University 
 * Semester Fall 22  
 * Course: CPS*2231 - Computer Programming 
 * Author(s): Abijith Manikandan CPS*2231 Section 01
 * Lab: 2 
 * Task: 4 
 * Program Description: Reports the sum of provided integers provided from the user when prompted using Scanner class. Uses a method to simplify the process 
 ********************************************************************************/ 
package Lab_2;

import java.util.Scanner;

public class task4 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter the first integer 
		System.out.println("Enter the value for 'a' and press Enter: ");
		int a = input.nextInt(); 

		//Prompt the user to enter the first integer 
		System.out.println("Enter the value for 'b' and press Enter: ");
		int b = input.nextInt(); 

		//Close the scanner. It's good practice to release the resource that was acquired
		input.close(); 

		//Display the result 
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a, b, sum(a, b));		
	}
	public static int sum(int num1, int num2)
	{
		return num1 + num2; 
	}
}
