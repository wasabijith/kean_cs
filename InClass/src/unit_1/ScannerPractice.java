package unit_1;

import java.util.Scanner;

public class ScannerPractice 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a double value: ");
		System.out.println(input.nextDouble());
		
		System.out.print("Provide an integer: ");
		System.out.println(input.nextInt());
		
		System.out.println("Provide a word: ");
		System.out.println(input.next());
	}
}
