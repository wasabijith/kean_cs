package unit_1;

import java.util.Scanner;

public class IsEvenMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		int num = input.nextInt(); 
		input.close();
		
		if(num % 2 == 0)
		{
			System.out.println("Number is even");
		}
		else 
		{
			System.out.println("Number is odd");
		}
	}
/*
	public int isEven()
	{
		if(num % 2 == 0)
		{
			System.out.println("Number is even");
		}
		else 
		{
			System.out.println("Number is odd");
		}
	}
	*/
}
