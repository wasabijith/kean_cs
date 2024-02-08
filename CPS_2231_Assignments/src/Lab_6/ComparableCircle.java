package Lab_6;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>
{
	public ComparableCircle(double radius)
	{
		super(radius); 
	}
	
	@Override 
	public int compareTo(ComparableCircle obj)
	{
		if(getRadius() > obj.getRadius())
		{
			return 1; 
		}

		else if (getRadius() < obj.getRadius())
		{
			return -1; 
		}

		else 
		{
			return 0; 
		}
	}
	
	@Override // Implement the toString method in GeometricObject
	public String toString() 
	{
		return "Radius: " + getRadius();
	}
}