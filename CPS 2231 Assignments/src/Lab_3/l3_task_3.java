/******************************************************************************* 
 * Kean University 
 * Semester: Fall 22  
 * Course: CPS*2231 - Computer Programming 
 * Author: Abijith Manikandan, CPS*2231 - Computer Programming, Section 01 
 * Lab: 3 
 * Task: 3
 * Program Description: Computes the average of the students grades.
 *************************************************************************/ 
package Lab_3;

public class l3_task_3 
{
	public static void main(String[] args) 
	{
		double [][] studentGrade = 
		{
			{10,20,0},
			{20,40,0}
		};
		
		computeAvg(studentGrade); 
	}
	
	public static void computeAvg(double [][] studentGrade)
	{
		for (int row = 0; row < studentGrade.length; row++)
		{
			double average = 0;
			for (int column = 0; column < 2; column++)
			{
				average += studentGrade[row][column]; 
			}
            average /= 2;
            studentGrade [row][2] = average; 
		}
		
		for (int row = 0; row < studentGrade.length; row++)
		{
			for (int column = 0; column < 3; column++)
			{
				System.out.print(studentGrade[row][column] + " ");
			}
			System.out.println();
		}
	}
}
