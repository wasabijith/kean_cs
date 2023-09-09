package HW5;
import java.util.Arrays;
import java.util.Random;

public class RadixSort 
{
	public static void main(String[] args)
	{
		int size = 100000; 
		int[] random = new int[size]; 
	
		Random r = new Random();
	
		long startTime = System.nanoTime(); 
		for (int i = 0; i < random.length; i++)
		{
			random[i] = r.nextInt(100000);
		}
		
		radixsort(random); 
		long endTime = System.nanoTime(); 
		long duration = endTime - startTime; 
		
		System.out.println("The total time taken: " + duration + " nanoseconds.");
	}

	private static void radixsort(int[] random) {
		// TODO Auto-generated method stub
		
	}
}

