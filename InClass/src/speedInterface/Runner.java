package speedInterface;

//Subclass of Athlete
public class Runner extends Athlete implements Speed
{
	@Override 
	public double speedCalc() 	
	{
		return 100/10; 
	}
}
