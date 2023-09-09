/*******************************************************************************  
* Kean University  
* Fall 2022
* Course: CPS*2231 - Computer Programming  
* Author: Abijith Manikandan, CPS 2231, Section 01  
* Lab Assignment: 5, Laptop.java Program 
* Description: Laptop class
*************************************************************************/  
package Lab_Assignment_5;

public class Laptop extends Computer
{
	//Data Fields 
	private double weight; 
	
	//Default Constructor 
	public Laptop() 
	{
		super(); 
	}
		
	//Overloaded Constructor (with weight)
	public Laptop(double weight) 
	{
		super(); 
		this.weight = weight; 
	}
	
	//Another Constructor (with all values) 
	public Laptop(double weight, String model, String brandName, String manufacturingDate, int numberOfCores)
	{
		super(model, brandName, manufacturingDate, numberOfCores);
		this.weight = weight; 
	}

	//Getters and Setters 
	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	//toString Method
	@Override
	public String toString() 
	{
		String laptopOutput = "Laptop weight: " + weight + " pds"+ ", Model: " + getModel()
		+ ", Brand Name: " + getBrandName() + ", Manufactured: " + getManufacturingDate()
		+ ", Number of Cores: " + getNumberOfCores();
		return laptopOutput; 
	}
}