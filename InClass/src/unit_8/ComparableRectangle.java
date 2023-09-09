package unit_8;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>
{
	public ComparableRectangle(double width, double height)
	{
		super(width, height); 
	}

	@Override 
	public int compareTo(ComparableRectangle obj)
	{
		if(getArea() > obj.getArea())
		{
			return 1; 
		}

		else if (getArea() < obj.getArea())
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
		return "Width: " + getWidth() + " Height: " + getHeight() + " Area: " + getArea();
	}
}
