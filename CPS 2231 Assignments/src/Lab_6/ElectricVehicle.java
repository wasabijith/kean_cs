package Lab_6;

public class ElectricVehicle extends Vehicle 
{
	//Data Fields 
	private int batteryCapacity; 
	
	//Constructor 
	public ElectricVehicle()
	{
		super(); 
	}
	
	//Constructor 
	public ElectricVehicle(String name, String model, int year, int vehicleID, int batteryCapacity) 
	{
		super(name, model, year, vehicleID); 
		this.batteryCapacity = batteryCapacity;
	}

	//Getters and Setters 
	public void setBatteryCapacity(int batteryCapacity) 
	{
		this.batteryCapacity = batteryCapacity;
	}
	
	public int getBatteryCapacity() 
	{
		return batteryCapacity;
	}
	
	public int getSeatingCapacity()
	{
		return 4; 
	}
	
	public String toString()
	{
		return super.toString() + ". \nThe battery capacity is: " + batteryCapacity; 
	}
}
