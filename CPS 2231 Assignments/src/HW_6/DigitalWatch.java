package HW_6;

public class DigitalWatch extends Watch
{
	//Data fields 
	private int hourFormat; 
	
	//Constructor 
	public DigitalWatch()
	{
		super(); 
	}
	
	//Constructor 
	public DigitalWatch(String brand, String material, double price, int hourFormat)
	{
		super(brand, material, price); 
		this.hourFormat = hourFormat; 
	}

	//Getters and setters 
	public void setHourFormat(int hourFormat) 
	{
		this.hourFormat = hourFormat;
	}
	
	public int getHourFormat() 
	{
		return hourFormat;
	}
	
	//isWaterProof method
	@Override 
	public boolean isWaterProof() 
	{
		return true; 
	}
	
	@Override
	public String howToChangeWatchTime() 
	{
		return "How to Adjust Time: Press the set button and change to the preferred minutes and hour by cycling through";
	}
	
	//toString 
	public String toString() 
	{
		return super.toString() + ". \nThe hour format is: " + hourFormat + "."; 
	}
}
