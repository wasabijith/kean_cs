/******************************************************************************* 
* Kean University 
* Semester Fall 22  
* Course: CPS*2231 - Computer Programming 
* Author(s): Abijith Manikandan CPS*2231 Section 01
* Lab: 2 
* Task: 7 (finding minimum instead of sum)
* Program Description: Methods with variable length arguments (finding minimum)
********************************************************************************/ 
package Lab_2;
import java.lang.Math; 

public class task7_minimum
{
	public static void main(String[] args) 
	{
		MinTest(34,3); 
		MinTest(34,3,3); 
		MinTest(34,3,3,2); 
		MinTest(34,3,3,2,56); 
		MinTest(34,3,3,2,56,5); 
		MinTest(34,3,3,2,56,55,990); 
	}
		
	public static void MinTest(int...numbers)
	{
		int minimum = Math.min(numbers[0], numbers[1]); 
			
		for (int i : numbers)
		{
			minimum = Math.min(minimum, i); 
		}
		System.out.println("The minimum of the numbers is: " + minimum);
	}
}

