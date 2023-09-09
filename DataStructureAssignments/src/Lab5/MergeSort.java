package Lab5;

import java.util.Arrays;
public class MergeSort {
	public static void mergeSort(int[] list) {
		System.out.println("at the beginning of Mergesort: " +Arrays.toString(list));
		if (list.length > 1) {
			// apply MergeSort on the first half
			int[] firstHalf = new int[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
			// apply MergeSort on the second half
			int secondHalfLength = list.length - list.length / 2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length / 2,
					secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			// Merge firstHalf with secondHalf
			merge(firstHalf, secondHalf, list);
			System.out.println("at the end of Mergesort: " +Arrays.toString(list));
		}
	}
	public static void merge(int[] list1, int[] list2, int[] temp) {
		System.out.println("at the beginning of merge: " + Arrays.toString(list1) + ", " +
				Arrays.toString(list2) + ", " + Arrays.toString(temp));
		int current1 = 0; // Current index in list1
		int current2 = 0; // Current index in list2
		int current3 = 0; // Current index in temp
		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1] < list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
		System.out.println("at the end of merge: " + Arrays.toString(temp));
	}
	/** Main method */
	public static void main (String[] args) 
	{
		int [] list = {1, 1, 7, 0, 3, 9, 2};
		mergeSort(list);
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
}
