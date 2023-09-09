package midterm1_Review;

public class indexOfSmallestElement {

	public static void main(String[] args) 
	{
		int[] array = {5,7,3,23,7}; 
		int min = array[0]; 
		for (int i = 0; i <= 5; i++)
		{
			if (array[i] < min)
			{
				min = array[i]; 
			}
		}
		System.out.println("The minimum value in the array is " + min);
	}
}
