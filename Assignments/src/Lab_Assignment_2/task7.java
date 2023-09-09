/******************************************************************************* 
* Kean University 
* Semester Fall 22  
* Course: CPS*2231 - Computer Programming 
* Author(s): Abijith Manikandan CPS*2231 Section 01
* Lab: 2 
* Task: 7
* Program Description: Methods with variable length arguments
********************************************************************************/ 
package Lab_Assignment_2;

public class task7
{
	public static void main(String[] args) 
	{
		sum(34,3); 
		sum(34,3,3); 
		sum(34,3,3,2); 
		sum(34,3,3,2,56); 
		sum(34,3,3,2,56,5); 
		sum(34,3,3,2,56,55,990); 
	}
	
	public static void sum(int...numbers)
	{
		int sum = 0; 
			
		for (int i : numbers)
		{
			sum += i; 
		}
		System.out.println("The sum of the numbers is: " + sum);
	}
}
