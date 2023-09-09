/*************************************************************** 
* Kean University 
* Fall 2021 
* Course: CPS*2231 - Computer Programming 
* Author: Abijith Manikandan, CPS*2231 - Computer Programming, Section 01 
* Homework: 2, task 2
* Program Description: Populates a 6x5 matrix with randomly generated 
integers from 100 to 500.
***************************************************************/ 
package assignment_2;
import java.util.Random; 

public class as2question2 
{
	public static void main(String[] args) 
	{
		Random r = new Random(); 
		int[][] matrix = new int[6][5];
		int matrixMax = 500;
		int matrixMin = 100;
		System.out.println("Initial Matrix: \n");
		
		//generates random values between 100-500 in a 6x5 matrix
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				matrix[i][j] = (int)(Math.random()*(matrixMax - matrixMin) + matrixMin);
				System.out.print(matrix[i][j] + " | " + "\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");

		//traverses through the initial matrix and multiplies odd numbers by 2 and prints updated matrix
		System.out.println("New Matrix: \n");
		String originalEven = "";
		String convertedEven = ""; 

		for(int i = 0; i < 6; i++) 
		{
			for(int j = 0; j < 5; j++) 
			{
				if (matrix[i][j] % 2 == 0)
				{
					System.out.print((matrix[i][j])+ " | " + "\t");
				}
				else 
				{
					System.out.print((matrix[i][j] * 2)+ " | " + "\t");
				}
			}
			System.out.print("\n");
		}
	}
}
