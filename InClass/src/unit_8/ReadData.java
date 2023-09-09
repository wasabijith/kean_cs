package unit_8;
import java.util.Scanner; 
import java.io.*; 

public class ReadData 
{
	public static void main(String[] args) throws Exception 
	{
		//Create a file instance 
		File file = new java.io.File("C:\\Users\\abiji\\eclipse-workspace\\InClass\\scores.txt"); 
		
		//Create a scanner for the file 
		Scanner input = new Scanner(file); 
		
		//Read data from a file 
		while(input.hasNext())
		{
			String firstName = input.next(); 
			String mi = input.next();
			String lastName = input.next();
			String score = input.next(); 
			String s1 = input.next();
			System.out.println(firstName + " " + mi + " " + lastName + " " + score);
		}
		
		//Close the file 
		input.close();
	}
}
