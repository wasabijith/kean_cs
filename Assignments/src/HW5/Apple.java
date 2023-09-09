/*******************************************************************************  
 * Kean University  
 * Fall 2022
 * Course: CPS*2231 - Computer Programming  
 * Author: Abijith Manikandan, CPS 2231, Section 01  
 * Homework: 5, Apple.java Program 
 * Description: Apple class
 *************************************************************************/  
package HW5;

public class Apple extends Fruit
{
	//Data Fields 
	private String variety; 
	private String texture; 
	
	//Constructor 
	public Apple() 
	{
		super(); 
	}
	
	//Constructor 
	public Apple(String variety, String texture, Color color, int calories, double pricePerPound) 
	{
		super(color, calories, pricePerPound); 
		this.variety = variety; 
		this.texture = texture; 
	}

	//Getters and setters
	public String getVariety() 
	{
		return variety;
	}

	public void setVariety(String variety) 
	{
		this.variety = variety;
	}

	public String getTexture() 
	{
		return texture;
	}

	public void setTexture(String texture) 
	{
		this.texture = texture;
	}
	
	//Override toString()
	@Override 
	public String toString()
	{
		return "The apple's variety is: " + variety + ". The texture is: " + texture + ". The color is: " + getColor() + ". The amount of calories are: " + getCalories() + ". The price per pound is: " + getPricePerPound() + ".";
	}
}
