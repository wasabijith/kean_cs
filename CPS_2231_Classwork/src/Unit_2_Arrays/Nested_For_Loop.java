package Unit_2_Arrays;
import java.util.Scanner;

public class Nested_For_Loop 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[][] array1 = new int[5][3]; 
		int[][] table = new int[3][3]; 
		System.out.println("Number of rows: " + array1.length);
		System.out.println("Number of columns: " + array1[4].length);
		
		for (int row = 0; row < table.length; row++)
		{
			for (int column = 0; column < table[row].length; column++)
			{
				table[row][column] = input.nextInt(); 
			}
		}
		System.out.println("Input is received");
		
		//	Print the array 
		for (int row = 0; row < array1.length; row++)
		{
			System.out.println(matrix[row][column] + "|");
		}
	}
}
