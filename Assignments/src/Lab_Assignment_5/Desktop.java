/*******************************************************************************  
* Kean University  
* Fall 2022
* Course: CPS*2231 - Computer Programming  
* Author: Abijith Manikandan, CPS 2231, Section 01  
* Lab Assignment: 5, Desktop.java Program 
* Description: Desktop class
*************************************************************************/  
package Lab_Assignment_5;

public class Desktop extends Computer
{
	//Data Fields 
	private double width; 
	private double height; 
	
	//Default Constructor 
	public Desktop() 
	{
		super(); 
	}
	
	//Overloaded Constructor (with width and height)
	public Desktop(double width, double height) 
	{
		super(); 
		this.width = width; 
		this.height = height; 
	}
	
	//Another Constructor (with all values) 
	public Desktop(double width, double height, String model, String brandName, String manufacturingDate, int numberOfCores)
	{
		super(model, brandName, manufacturingDate, numberOfCores); 
		this.width = width; 
		this.height = height; 
	}

	//Getters and Setters
	public double getWidth() 
	{
		return width;
	}

	public void setWidth(double width) 
	{
		this.width = width;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	} 
	
	//toString Method
	@Override
	public String toString() 
	{
		String desktopOutput = "Desktop width: " + width + " inches" + ", height: " + height + " inches" + ", Model: " + getModel()
		+ ", Brand Name: " + getBrandName() + ", Manufactured: " + getManufacturingDate()
		+ ", Number of Cores: " + getNumberOfCores();
		return desktopOutput; 
	}
}
