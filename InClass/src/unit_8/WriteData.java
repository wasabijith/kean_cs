package unit_8;

import java.io.*; 

public class WriteData 
{
	public static void main (String[] args) throws java.io.IOException 
	{
		File file = new File("scores.txt");
		if(file.exists())
		{
			System.out.println("File already exists");
			System.exit(0);
		}
		else
		{
			//Create File 
			PrintWriter output = new PrintWriter(file); 
			
			//Write formatted output to the file 
			output.print("John T Smith ");
			output.println(90); 
			output.print("Eric K Jones ");
			
			//Close the file 
			output.close();
			
			System.out.println("New File is created and the scores are stored in the file");
		}
	}
}
