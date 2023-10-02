package Unit_2_Arrays;

public class Passing_Array_to_Methods 
{
	public static void main(String[] args)
	{
		int[] list = {3, 1, 6, 4, 2};
		printArray(list); 
		System.out.println();
	}
	
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
}
