/*******************************************************************************  
* Kean University  
* Fall 2022
* Course: CPS*2231 - Computer Programming  
* Author: Abijith Manikandan, CPS 2231, Section 01  
* Lab Assignment: 5, Computer.java Program 
* Description: Computer class
*************************************************************************/  
package Lab_Assignment_5;

public class Computer 
{
	//Data Fields
	private String model;
	private String brandName; 
	private String manufacturingDate; 
	private int numberOfCores; 
	
	//Default Constructor 
	public Computer() 
	{
		
	}
	
	//Overloaded Constructor 
	public Computer(String model, String brandName, String manufacturingDate, int numberOfCores) 
	{
		this.model = model;
		this.brandName = brandName;
		this.manufacturingDate = manufacturingDate; 
		this.numberOfCores = numberOfCores; 
	}

	//Getters and Setters
	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public String getBrandName() 
	{
		return brandName;
	}

	public void setBrandName(String brandName) 
	{
		this.brandName = brandName;
	}

	public String getManufacturingDate() 
	{
		return manufacturingDate;
	}

	public void setManufacturingDate(String manufacturingDate) 
	{
		this.manufacturingDate = manufacturingDate;
	}

	public int getNumberOfCores() 
	{
		return numberOfCores;
	}

	public void setNumberOfCores(int numberOfCores) 
	{
		this.numberOfCores = numberOfCores;
	}
	
	//toString Method
	public String toString()
	{
		String output = "The specifications of the system are " +  model + brandName + manufacturingDate + numberOfCores + " cores ";
		return output; 
	}
}
