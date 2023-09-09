package Lab_Assignment_6;

public abstract class Vehicle 
{
	//Main method
	public static void main(String[] args)
	{
		//new instance of "ElectricVehicle" class using no arg constructor assigned to object reference type of "Vehicle" class
		Vehicle v1 = new ElectricVehicle();

		//new instance of the "ElectricVehicle" class using the overloaded constructor assigned to object reference type "Vehicle" class
		Vehicle v2 = new ElectricVehicle("Tesla", "Model 3", 2022, 19341, 82);

		//display the content of both the objects using toString() method
		System.out.println("Electric Vehicle created using a no-argument consructor\n" + v1.toString());
		System.out.println();
		System.out.println("Electric Vehicle created using an overloaded consructor\n" + v2.toString());
	}

	//Data Fields 
	protected String name; 
	protected String model; 
	protected int year; 
	protected int vehicleID; 

	//Constructor 
	public Vehicle() 
	{
		
	}

	//Constructor
	public Vehicle(String name, String model, int year, int vehicleID) 
	{ 
		this.name = name; 
		this.model = model; 
		this.year = year; 
		this.vehicleID = vehicleID; 
	}

	//Getters and setters 
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public String getModel() 
	{
		return model;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public int getYear() 
	{
		return year;
	}

	public void setVehicleID(int vehicleID) 
	{
		this.vehicleID = vehicleID;
	}

	public int getVehicleID() 
	{
		return vehicleID;
	}

	//Abstract method 
	public abstract int getSeatingCapacity(); 

	//toString method 
	public String toString() 
	{
		return "The vehicle's name is: " + name + ". \nThe model is: " + model + ". \nThe year manufactured is: " + year + ". \nThe vehicle ID is: " + vehicleID + ". \nThe seating capacity is: " + getSeatingCapacity(); 
	}
}
