/*************************************************************** 
 * Kean University 
 * Fall 2021 
 * Course: CPS*2231 - Computer Programming 
 * Author: Abijith Manikandan, CPS*2231 - Computer Programming, Section 01 
 * Homework: 2, task 1
 * Program Description: Generates  10  integers  from  -10  to  10, 
stores  them  in  an  1D  array  and  finds  their  maximum  value. Finds execution time.   
 ***************************************************************/ 
package HW_2;
import java.util.Arrays;
import java.util.Random; 

public class hw2question1 
{
	public static void main(String[] args) 
	{
		//variables to measure execution time for finding maximum element for 1st array
		long arr1begin, arr1end, arr1time;
		long arr2begin, arr2end, arr2time;
		long arr3begin, arr3end, arr3time;
		long arr4begin, arr4end, arr4time;
		
		//new array #1!
		int[] arr1 = new int[10];  
		int arr1min = -10; 
		int arr1max = 10; 
		//Generates 10 Random Numbers in the range -10 to 10
		for(int i = 0; i < arr1.length; i++) 
		{
			arr1[i] = (int)(Math.random()*(arr1max - arr1min) + arr1min);
		}
		//find the largest element of the array and start execution time detection
		arr1begin = System.nanoTime(); 
		int maxElement1 = arr1[0]; 
		for (int i = 0; i < arr1.length; i++)
		{
			if(arr1[i] > maxElement1)
			{
				maxElement1 = arr1[i]; 
			}
		}		
		arr1end = System.nanoTime(); 
		arr1time = arr1end - arr1begin; 
		
		//new array #2!
		int[] arr2 = new int[100];  
		int arr2min = -100; 
		int arr2max = 100; 
		//Generates 100 Random Numbers in the range -100 to 100
		for(int i = 0; i < arr2.length; i++) 
		{
			arr2[i] = (int)(Math.random()*(arr2max - arr2min) + arr2min);
		}
		//find the largest element of the array and start execution time detection
		arr2begin = System.nanoTime(); 
		int maxElement2 = arr2[0]; 
		for (int i = 0; i < arr2.length; i++)
		{
			if(arr2[i] > maxElement2)
			{
				maxElement2 = arr2[i]; 
			}
		}		
		arr2end = System.nanoTime(); 
		arr2time = arr2end - arr2begin; 
		
		//new array #3!
		int[] arr3 = new int[10000];  
		int arr3min = -10000; 
		int arr3max = 10000; 
		//Generates 10,000 Random Numbers in the range -10000 to 10000
		for(int i = 0; i < arr3.length; i++) 
		{
			arr3[i] = (int)(Math.random()*(arr3max - arr3min) + arr3min);
		}
		//find the largest element of the array and start execution time detection
		arr3begin = System.nanoTime(); 
		int maxElement3 = arr3[0]; 
		for (int i = 0; i < arr3.length; i++)
		{
			if(arr3[i] > maxElement3)
			{
				maxElement3 = arr3[i]; 
			}
		}		
		arr3end = System.nanoTime(); 
		arr3time = arr3end - arr3begin; 
		
		//new array #4!
		int[] arr4 = new int[10000000];  
		int arr4min = -10000000; 
		int arr4max = 10000000; 
		//Generates 10,000,000 Random Numbers in the range -10,000,000 to 10,000,000
		for(int i = 0; i < arr4.length; i++) 
		{
			arr4[i] = (int)(Math.random()*(arr4max - arr4min) + arr4min);
		}
		//find the largest element of the array and start execution time detection
		arr4begin = System.nanoTime(); 
		int maxElement4 = arr4[0]; 
		for (int i = 0; i < arr4.length; i++)
		{
			if(arr4[i] > maxElement4)
			{
				maxElement4 = arr4[i]; 
			}
		}		
		arr4end = System.nanoTime(); 
		arr4time = arr4end - arr4begin; 
		
		//display the results!
		System.out.println("Array size " + "\t" + " | " + arr1.length + "\t" +" | " + arr2.length + "\t" +" | " + arr3.length +"  | " + arr4.length + " | ");
		System.out.println("Execution time " + "\t" +" | " + arr1time + "\t" +" | " + arr2time + "\t" +" | " + arr3time + " | " + arr4time + "  | ");
		System.out.println("\n");
		System.out.println("It took " + arr1time + " nanoseconds to find a maximum in the array of " + arr1.length + " elements." + " The maximum value is: " + maxElement1);
		System.out.println("It took " + arr2time + " nanoseconds to find a maximum in the array of " + arr2.length + " elements." + " The maximum value is: " + maxElement2);
		System.out.println("It took " + arr3time + " nanoseconds to find a maximum in the array of " + arr3.length + " elements." + " The maximum value is: " + maxElement3);
		System.out.println("It took " + arr4time + " nanoseconds to find a maximum in the array of " + arr4.length + " elements." + " The maximum value is: " + maxElement4);
	}
}
