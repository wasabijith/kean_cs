/*******************************************************************************  
 * Kean University  
 * Fall 2022
 * Course: CPS*2231 - Computer Programming  
 * Author: Abijith Manikandan, CPS 2231, Section 01  
 * Homework: 5, Fruit.java Program 
 * Description: Fruit class
 *************************************************************************/  
package HW_5;

enum Color 
{ 
	YELLOW, ORANGE, RED, PURPLE; 
} 

public class Fruit 
{
	//Data Fields
	private Color color; 
	private int calories; 
	private double pricePerPound; 
	protected static int numberOfFruits; 
	
	//Constructor
	public Fruit()
	{
		numberOfFruits++; 
	}
	
	//Constructor
	public Fruit(Color color, int calories, double pricePerPound)
	{
		this.color = color; 
		this.calories = calories; 
		this.pricePerPound = pricePerPound; 
		numberOfFruits++; 
	}

	//Getters and setters
	public Color getColor() 
	{
		return color;
	}

	public void setColor(Color color) 
	{
		this.color = color;
	}

	public int getCalories() 
	{
		return calories;
	}

	public void setCalories(int calories) 
	{
		this.calories = calories;
	}

	public double getPricePerPound() 
	{
		return pricePerPound;
	}

	public void setPricePerPound(double pricePerPound) 
	{
		this.pricePerPound = pricePerPound;
	}

	public static int getNumberOfFruits() 
	{
		return numberOfFruits;
	}	
	
	//toString()
	public String toString()
	{
		return "The fruit's color is: " + color + ". The amount of calories are: " + calories + ". The price per pound is: " + pricePerPound + "."; 
	}
}
