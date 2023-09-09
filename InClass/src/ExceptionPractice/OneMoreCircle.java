package ExceptionPractice;

public class OneMoreCircle 
{
	private double radius; 

	public static void main(String[] args) 
	{
		try 
		{
			OneMoreCircle r = new OneMoreCircle(); 
			r.setRadius(1.0); //Invoke with positive 
			r.setRadius(-1.0); //Invoke with negative 
		}

		catch(IllegalArgumentException ex1)
		{
			System.out.println("Deal with the negative.");
		}

		catch(Exception ex)
		{
			System.out.println("Deal with some other issue.");
		}
	}

	public void setRadius(double newRadius) throws IllegalArgumentException
	{ 
		if(newRadius >= 0)
		{
			radius = newRadius; 
			System.out.println("The radius " + newRadius + " was set.");
		}

		else 
		{
			throw new IllegalArgumentException("Radius cannot be negative."); 
		}
	}
}
