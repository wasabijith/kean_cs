package speedInterface;

//Subclass of Vehicle 
public class Truck extends Vehicle
{
	@Override 
	public double speedCalc() 
	{
		double distanceTraveled = 55; 
		double timeTaken = 12.5; 
		double speedOfTruck = distanceTraveled/timeTaken; 
		return speedOfTruck; 
	}
}
