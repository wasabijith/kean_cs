package Lab2;

public class LinearSearch2 
{
	/** The method for finding a key in the list */
	public static int linearSearch(int[] arr, int key, int index) 
	{
	    if (index >= arr.length)
	        return -1;
	    if (arr[index] == key)
	        return index;
	    return linearSearch(arr, key, index + 1);
	}
	
	public static void main(String[] args) 
	{
		final int N = 10;
		final int KEY = 4;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) 
		{
			//generate random positive and negative numbers from -100 to 100
			arr [i]= (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
			//print them
			System.out.print(arr[i] + "," );
		}
		long begin, end, time; // we will measure time it took to search
		begin = System.nanoTime();//we measure in nanoseconds.
		//Starting the watch
		System.out.println(linearSearch(arr, KEY, 0));
		end = System.nanoTime();
		time = end-begin;
		System.out.println("it took " + time + " nanoseconds to run linear search with the key " + KEY + " on the array of " + N + " elements.");
	}
}