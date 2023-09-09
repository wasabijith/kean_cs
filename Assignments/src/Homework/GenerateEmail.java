package Homework;
import java.util.Scanner;
import java.util.Random;

public class GenerateEmail 
{
	//main method that calls all the other methods and accepts up to 5 student full name inputs
	public static void main(String[] args)  
	{
		String firstName= ""; 
		String lastName = ""; 
		String fullName = "";
		String allLasts = "";
		String allFirst = "";

		for(int i = 0; i < 5; i++) 
		{
			Scanner input = new Scanner(System.in); 
			System.out.print("Enter your first name: ");
			firstName = input.nextLine(); 

			System.out.print("Enter your last name: ");
			lastName = input.nextLine(); 

			fullName = firstName + " " + lastName;
			System.out.println();
			System.out.printf("%-30s%-30s%-30s\n", "Full Name", "Kean Email", "Password");

			if(allFirst.contains(firstName.substring(0,1).toLowerCase()) &&  allLasts.contains(lastName))
			{
				System.out.printf("%-30s%-30s%-30s\n",fullName, generateEmail(firstName,lastName, allLasts, allFirst), generatePassword());
			}

			else 
			{
				System.out.printf("%-30s%-30s%-30s\n",fullName, generateEmail(firstName,lastName), generatePassword());
			}
			System.out.println();

			allLasts = allLasts+ " " + lastName;
			allFirst = allFirst + " " + firstName.substring(0,1).toLowerCase();
		}
	}

	//method that will generate the email ID of the student
	public static String generateEmail(String firstName, String lastName)
	{
		String email; 
		email = firstName.substring(0,1).toLowerCase() + lastName.toLowerCase() + "@kean.edu";
		return email;
	}

	//method that will generate the email ID for any duplicates
	public static String generateEmail(String firstName, String lastName, String allLasts, String allFirst)
	{
		String email = ""; 
		int extrachar = new Random().nextInt(9) + 2; 
		email = firstName.substring(0,1).toLowerCase() + lastName.toLowerCase() + extrachar + "@kean.edu";
		return email;
	}

	//method that generates random password between the values of 100000 and 900000
	public static int generatePassword()
	{
		int password = new Random().nextInt(900000) + 100000;
		return password;
	}
}