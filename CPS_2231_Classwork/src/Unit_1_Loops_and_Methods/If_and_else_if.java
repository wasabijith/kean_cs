package Unit_1_Loops_and_Methods;

import java.util.Scanner;

public class If_and_else_if 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		int score; 
		
		// Ask the user to enter the grade
		System.out.println("Please enter a score: ");
		score = input.nextInt(); 
		
		// Check the score and assign a letter grade based on the score 
		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		// User salary if and else if
		int salary; 
		
		// Ask the user to enter the salary 
		System.out.println("Please enter your salary: ");
		salary = input.nextInt(); 
		
		// Check the salary and see whether user gets bonus 
		if (salary >= 4500 && salary <= 6000)
			System.out.println("Your bonus is 250");
		else if (salary >= 3000 && salary <= 4500)
			System.out.println("Your bonus is 150");
		else
			System.out.println("No bonus");
	}
}
