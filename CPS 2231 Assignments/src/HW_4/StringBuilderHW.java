/*******************************************************************************
 * Kean University
 * Fall 2022
 * Course: CPS*2231 - Computer Programming
 * Author: Abijith Manikandan, CPS 2231, Section 01
 * Homework: 4, Task 1d and 2
 * Program Description: Practice with StringBuilder and Strings
 *************************************************************************/
package HW_4;
public class StringBuilderHW
{
	public static void main(String[] args)
	{
		//task 1 part d
		StringBuilder prompt = new StringBuilder ("Prepare for your Midterm exam");
		System.out.println(prompt);
		System.out.println("The capacity is: " + prompt.capacity());
		System.out.println("The index of the letter y is: " + prompt.indexOf("y"));
		StringBuilder afterModifyText = prompt.delete(0, 12);
		System.out.println(afterModifyText);
		String addText = "Good luck on ";
		afterModifyText.insert(0, addText);
		System.out.println(afterModifyText);
		afterModifyText.append('!');
		System.out.println(afterModifyText);
		
		//space between both programs
		System.out.println("--------------------------------");
		System.out.print("\n");
		
		//task 2 part 1
		long begin, end, time;
		int [] arr = new int [50];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = i;
		}
		String task1part1string = new String();
		begin = System.nanoTime();
		for(int i = 0; i < arr.length; i++)
		{
			task1part1string = task1part1string + arr[i];
		}
		end = System.nanoTime();
		time = end - begin;
		System.out.println("It took " + time + " nanoseconds to append 50 integers to the String");
		
		//task 2 part 2
		long begin2, end2, time2;
		begin2 = System.nanoTime();
		StringBuilder task2part2string = new StringBuilder();
		for(int i = 0; i < arr.length; i++)
		{
			task2part2string = task2part2string.append(arr[i]);
		}
		end2 = System.nanoTime();
		time2 = end2 - begin2;
		System.out.println("It took " + time2 + " nanoseconds to append 50 integers to the StringBuilder");
				
		//task 2 part 3
		long begin500, begin5000, end500, end5000, time500, time5000;
		long begin500Builder, begin5000Builder, end500Builder, end5000Builder,
		time500Builder, time5000Builder;
		int [] arr2_500 = new int [500];
		int [] arr2_5000 = new int [5000];
		String string500 = new String();
		String string5000 = new String();
		StringBuilder task2part3string500 = new StringBuilder();
		StringBuilder task2part3string5000 = new StringBuilder();
		for(int i = 0; i < arr2_500.length; i++)
		{
			arr2_500[i] = i;
		}
		for(int i = 0; i < arr2_5000.length; i++)
		{
			arr2_5000[i] = i;
		}
		
		//test 500 String
		begin500 = System.nanoTime();
		for(int i = 0; i < arr2_500.length; i++)
		{
			string500 = string500 + arr2_500[i];
		}
		end500 = System.nanoTime();
		time500 = end500 - begin500;
		System.out.println("It took " + time500 + " nanoseconds to append 500 integers to the String");
				
		//test 500 StringBuilder
		begin500Builder = System.nanoTime();
		for(int i = 0; i < arr2_500.length; i++)
		{
			task2part3string500 = task2part3string500.append(arr2_500[i]);
		}
		end500Builder = System.nanoTime();
		time500Builder = end500Builder - begin500Builder;
		System.out.println("It took " + time500Builder + " nanoseconds to append 500 integers to the StringBuilder");
				
		//test 5000 String
		begin5000 = System.nanoTime();
		for(int i = 0; i < arr2_5000.length; i++)
		{
			string5000 = string5000 + arr2_5000[i];
		}
		end5000 = System.nanoTime();
		time5000 = end5000 - begin5000;
		System.out.println("It took " + time5000 + " nanoseconds to append 5000 integers to the String");
		
		//test 5000 StringBuilder
		begin5000Builder = System.nanoTime();
		for(int i = 0; i < arr2_5000.length; i++)
		{
			task2part3string5000 = task2part3string5000.append(arr2_5000[i]);
		}
		end5000Builder = System.nanoTime();
		time5000Builder = end5000Builder - begin5000Builder;
		System.out.println("It took " + time5000Builder + " nanoseconds to append 5000 integers to the StringBuilder");
	}
}
