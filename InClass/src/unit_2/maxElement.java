package unit_2;

public class maxElement {

	public static void main(String[] args) {
		int[] arr = {5,32,10,91,25}; 
		int max = arr[0]; 
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i]; 
			}
		}
		System.out.println("The maximum value in the array is " + max);
	}

}
