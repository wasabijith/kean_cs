/******************************************************************************* 
 * Kean University 
 * Semester Fall 22  
 * Course: CPS*2231 - Computer Programming 
 * Author(s): Abijith Manikandan CPS*2231 Section 01
 * Lab: 2 
 * Task: 3  
 * Program Description: Reports the sum of provided integers provided from the user when prompted using Scanner class 
 ********************************************************************************/ 
package Lab_Assignment_2;

import java.util.Scanner;

public class task3 
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
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a, b, (a+b));		
	}
}
