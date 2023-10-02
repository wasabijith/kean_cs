package Unit_2_Arrays;

public class Shuffling_Arrays 
{
	public static void main(String[] args)
	{
		int[] numArray = new int[6]; 

		for(int i = 0; i < numArray.length; i++)
		{
			numArray[i] = (int)(Math.random()*100); 
		}

		System.out.println("Before shuffling: ");

		// Print array
		for(int i = 0; i < numArray.length; i++)
		{
			System.out.println(numArray[i]);
		}

		for(int i = 0; i < numArray.length; i++)
		{
			//	Randomly generate an index 
			int j = (int)(Math.random()*numArray.length); 

			//	Swap Operation
			int temp = numArray[i]; 
			numArray[i] = numArray[j]; 
			numArray[j] = temp; 
		}

		System.out.println("After shuffling: ");
		//	Print the array 
		for (int i = 0; i < numArray.length; i++)
		{
			System.out.println(numArray[i]);
		}
	}
}
