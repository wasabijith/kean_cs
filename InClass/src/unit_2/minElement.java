package unit_2;
import java.util.Scanner;

public class minElement {
	public static void main(String[] args) {
		int[] arr = new int [5]; 
		Scanner input = new Scanner (System.in); 
		System.out.println("Enter 5 numbers: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = input.nextInt(); 
		}
		input.close(); 
		int min = arr[0]; 
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i]; 
			}
		}
		System.out.println("The minimum value in the array is " + min);
	}
}
