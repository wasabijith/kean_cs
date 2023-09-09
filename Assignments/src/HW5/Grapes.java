/*******************************************************************************  
 * Kean University  
 * Fall 2022
 * Course: CPS*2231 - Computer Programming  
 * Author: Abijith Manikandan, CPS 2231, Section 01  
 * Homework: 5, Grapes.java Program 
 * Description: Grapes class
 *************************************************************************/  
package HW5;

public class Grapes extends Fruit
{
	//Data Fields 
	private String taste; 
	private boolean hasSeed; 
	
	//Constructor 
	public Grapes() 
	{
		super(); 
	}
	
	//Constructor 
	public Grapes(String taste, boolean hasSeed, Color color, int calories, double pricePerPound)
	{
		super(color, calories, pricePerPound);
		this.taste = taste; 
		this.hasSeed = hasSeed; 
	}

	//Getters and setters
	public String getTaste() 
	{
		return taste;
	}

	public void setTaste(String taste) 
	{
		this.taste = taste;
	}

	public boolean getHasSeed() 
	{
		return hasSeed;
	}

	public void setHasSeed(boolean hasSeed) 
	{
		this.hasSeed = hasSeed;
	}
	
	//Override toString() 
	@Override 
	public String toString() 
	{
		return "The grapes taste is: " + taste + ". Does it have seeds?: " + hasSeed + ". The color is: " + getColor() + ". The amount of calories are: " + getCalories() + ". The price per pound is: " + getPricePerPound() + ".";
	}
}
