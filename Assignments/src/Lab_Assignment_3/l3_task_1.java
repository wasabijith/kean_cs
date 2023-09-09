/******************************************************************************* 
 * Kean University 
 * Semester: Fall 22  
 * Course: CPS*2231 - Computer Programming 
 * Author: Abijith Manikandan, CPS*2231 - Computer Programming, Section 01 
 * Lab: 3 
 * Task: 1  
 * Program Description: Create a program that will randomly select four cards from a deck of cards.
 *************************************************************************/ 
package Lab_Assignment_3;
import java.util.Random; 

public class l3_task_1 
{
	public static void main(String[] args) 
	{
		//generate deck of cards 
		int [] deck = new int [52];
		String[] suitName = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] rankName = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		//initialize cards 
		for (int i = 0; i < deck.length; i++)
		{
			deck[i] = i; 
		}
		
		//shuffle the array 
		for (int i = 0; i < deck.length; i++)
		{
			int randomIndex = (int)(Math.random()*deck.length); 
			int tempValue = deck[i]; //swap cards in the deck 
			deck[i] = deck[randomIndex]; 
			deck[randomIndex] = tempValue; 
		}
		
		//display the four random cards selected 
		for (int i = 0; i < 4; i++)
		{
			String suit = suitName[deck[i] / 13]; 
			String rank = rankName[deck[i] % 13]; 
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}
}
