package unit_3;
import java.util.Arrays;

public class ByColumn2D {

	public static void main(String[] args) {
		int [][] matrix = {
				{2,5,9},
				{5,8,5}, 
				{9,6,7}
		};
		System.out.println(Arrays.deepToString(matrix));
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[i].length; j++)
			{
				int i1 = (int)(Math.random()*matrix.length);
				int j1 = (int)(Math.random()*matrix[i].length);
				//Swap matrix[i][j] with matrix [i1][j1]
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i1][j1];
				matrix[i1][j1] = temp;
			}
		}
		
		for(int row = 0; row < matrix.length; row++)
		{
			for(int column = 0; column < matrix[row].length; column++)
			{
				System.out.println(matrix[row][column] + " | ");
			}
			System.out.println();
		}
		/*
		for (int column = 0; column < matrix[0].length; column++)
		{
			int total = 0; 
			for (int row = 0; row < matrix.length; row++)
			{
				total += matrix[row][column]; 
				System.out.println("Sum for column " + column + " is " + total); 
			}
		}
		*/
	}

}
