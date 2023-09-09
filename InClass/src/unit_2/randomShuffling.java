package unit_2;
import java.util.Scanner;

public class randomShuffling {

	public static void main(String[] args) {
		int[] myList = new int [5]; 
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter 5 numbers: ");
		for(int i = 0; i < myList.length; i++)
		{
			myList[i] = input.nextInt(); 
		}
		input.close();	
		
		for (int i = 0; i < myList.length - 1; i++)
		{
			int j = (int) (Math.random()) * myList.length;
			
			double temp = myList[i]; 
			myList[i] = myList[j]; 
			myList[j] = temp; 
		}
	}

}
