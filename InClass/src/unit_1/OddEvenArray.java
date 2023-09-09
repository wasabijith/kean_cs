package unit_1;
import java.util.Scanner; 

public class OddEvenArray 
{
	public static void main(String[] args) 
	{
		int[] myList = new int [5]; 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		for(int i = 0; i < myList.length; i++)
		{
			myList[i] = input.nextInt(); 
		}
		input.close();	
		
		for (int i = 0; i < myList.length; i++)
		{
			if(myList[i] % 2 == 0)
			{
				System.out.println("Number is even");
			}
			else 
			{
				System.out.println("Number is odd");
			}
		}
	}
}
