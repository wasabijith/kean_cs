package Lab5;

import java.util.Random;

public class InsertionSort {
	  /** The method for sorting the numbers */
	  public static void insertionSort(int[] list) {
	    for (int i = 1; i < list.length; i++) {
	      /** insert list[i] into a sorted sublist list[0..i-1] so that
	          list[0..i] is sorted. */
	      int currentElement = list[i];
	      int k;
	      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
	        list[k + 1] = list[k];
	      }

	      // Insert the current element into list[k+1]
	      list[k + 1] = currentElement;
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
	    insertionSort(list);
	    begin = System.nanoTime();//we measure in nanoseconds.
	    for (int i = 0; i < list.length; i++)
	      System.out.print(list[i] + " ");
	    end = System.nanoTime();
		time = end-begin;
		System.out.println("\nIt took " + time + " nanoseconds to run Insertion sort on the array of " + list.length + " elements.");
	  }
	}