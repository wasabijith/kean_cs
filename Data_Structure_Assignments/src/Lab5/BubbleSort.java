package Lab5;
import java.util.*; 

public class BubbleSort {
	/** Bubble sort method */
	public static void bubbleSort(int[] list) {
		boolean needNextPass = true;

		for (int k = 1; k < list.length && needNextPass; k++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				if (list[i] > list[i + 1]) {
					// Swap list[i] with list[i + 1]
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;

					needNextPass = true; // Next pass still needed
				}
			}
		}
	}

	/** A test method */
	public static void main(String[] args) {
		long begin, end, time; // we will measure time it took to search
	    int[] list = new int[1000000];
	    Random rand = new Random();
	    for (int i = 0; i < 1000000; i++) 
	    {
	      list[i] = rand.nextInt(1000000);
	    }
	    bubbleSort(list);
		//Starting the watch
		begin = System.nanoTime();//we measure in nanoseconds.
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		//Ending the watch
		end = System.nanoTime();
		time = end-begin;
		System.out.println("\nIt took " + time + " nanoseconds to run Bubble sort on the array of " + list.length + " elements.");
	}
}