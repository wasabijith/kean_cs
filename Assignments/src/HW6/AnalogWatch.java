package HW6;

public class AnalogWatch extends Watch
{
	//Data fields 
	private int numOfHands; 
	
	//Constructor 
	public AnalogWatch() 
	{
		super(); 
	}
	
	//Constructor 
	public AnalogWatch(String brand, String material, double price, int numOfHands) 
	{
		super(brand, material, price); 
		this.numOfHands = numOfHands; 
	}

	//Getters and setters
	public void setNumOfHands(int numOfHands) 
	{
		this.numOfHands = numOfHands;
	}
	
	public int getNumOfHands() 
	{
		return numOfHands;
	}

	//isWaterProof method
	@Override 
	public boolean isWaterProof() 
	{
		return false; 
	}
	
	@Override
	public String howToChangeWatchTime() 
	{
		return "How to Adjust Time: Turn the crown counter-clockwise or clockwise to decrease or increase time"; 
	}
	
	//toString
	public String toString() 
	{
		return super.toString() + ". \nThe number of hands is: " + numOfHands + "."; 
	}
}
