package speedInterface;

//Abstract Parent Class implementing interface Speed
abstract public class Vehicle implements Speed
{
	public static void main(String[] args)
	{
		Vehicle v1 = new Car(); 
		System.out.println(v1.speedCalc());
		
		Vehicle v2 = new Truck(); 
		System.out.println(v2.speedCalc());
	}
}
