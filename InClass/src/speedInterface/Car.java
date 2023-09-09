package speedInterface;

//Subclass of Vehicle 
public class Car extends Vehicle
{
	@Override 
	public double speedCalc() 
	{
		double distanceTraveled1 = 100; 
		double distanceTraveled2 = 150; 
		double timeTaken = 25.6; 
		double totalDistance = distanceTraveled1 + distanceTraveled2; 
		double speedOfCar = totalDistance/timeTaken; 
		return speedOfCar; 
	}
}
