package HW4;

public class maxElement 
{
	//initiative/naive method to find max element in array
	public static int greatestElementNaive(int [] array)
	{
		int i; 
		int size = 15; 
		int maxElement = array[0]; 
		
		for(i = 1; i < size; i++)
		{
			if(maxElement < array[i])
			{
				maxElement = array[i];
			}
		}
		return maxElement; 
	}
	
	//DivideAndConquer method to find the max element in array 
	public static int greatestElementDivideandConquer(int[] array, int min, int max)
	{
		if(min == max)
		{
			return array[min];
		}
		
		else
		{
			int mid = (min + max) / 2; 
			int maximumOfLeft = greatestElementDivideandConquer(array, min, mid); 
			int maximumOfRight = greatestElementDivideandConquer(array, mid + 1, max); 
			return Math.max(maximumOfLeft, maximumOfRight); 
		}
	}
	
	public static void main(String[] args)
	{
		int[] array = {2, 3, 4, 1, 9, 12, 13, 11, 10, 5, 7, 8, 15, 14, 6}; 
		
		//Naive method runtime calculations 
		long beginNaive = System.nanoTime(); 
		int maxNaive = greatestElementNaive(array); 
		long endNaive = System.nanoTime(); 
		long fullTimeNaive = endNaive - beginNaive; 
		
		//Divide and Conquer runtime calculations
		long beginDivide = System.nanoTime(); 
		int maxDivide = greatestElementDivideandConquer(array, 0, 15-1); 
		long endDivide = System.nanoTime(); 
		long fullTimeDivide = endDivide - beginDivide; 
		
		//Print out format
		System.out.println("Naive method max: " + maxNaive);
		System.out.println("Total Naive method time: " + fullTimeNaive);
		System.out.println();
		System.out.println("Divide and Conquer max: " + maxDivide);
		System.out.println("Total Divide and Conquer method time: " + fullTimeDivide);
	}
}
