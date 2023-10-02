package Unit_2_Arrays;

import java.util.Arrays;

public class Sorting_Arrays 
{
	public static void main(String[] args) 
	{
		double[] numbers = {6,8,1,2,3,6,9,4}; 
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		String[] names = {"Abi", "Alyssa", "Bob", "Zack", "Yo Mama", "Chris"}; 
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		int j = Arrays.binarySearch(names, "Alyssa"); 
		System.out.println("We found the stinky person at index: " + j + " and her name is: " + names[1]);
	}
}
