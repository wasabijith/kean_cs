/******************************************************************************* 
* Kean University 
* Semester Fall 22  
* Course: CPS*2231 - Computer Programming 
* Author(s): Abijith Manikandan CPS*2231 Section 01
* Lab: 2 
* Task: 2  
* Program Description: Reports the sum of provided integers, formatted using the printf() method 
********************************************************************************/ 
package Lab_2;

public class task2 
{
	public static void main(String[] args) 
	{
		//assume we have 2 numbers a and b, a = 2, b = 5
		int a = 2; 
		int b = 5; 
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a, b, (a+b));

		//assume we have 2 numbers a and b, a = 4, b = 4
		a = 1000; 
		b = 2000; 
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a, b, (a+b));

		//assume we have 2 numbers a and b, a = 1000, b = 2000
		a = 1000; 
		b = 2000; 
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a, b, (a+b));

		//assume we have 2 numbers a and b, a = 100, b = 101 
		a = 100; 
		b = 101; 
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a, b, (a+b));
	}
}
