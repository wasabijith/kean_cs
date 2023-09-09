package ClassAbstraction;

public abstract class GeometricObject 
{
	//Data Fields 
	private String color = "white"; 
	private boolean filled; 
	private java.util.Date dateCreated; 

	//Default Constructor
	public GeometricObject()
	{	
		dateCreated = new java.util.Date(); 
		System.out.println("Geometric Object's Default Constructor 1 is invoked");
	}

	//Another Constructor 
	public GeometricObject(String color, boolean filled)
	{
		dateCreated = new java.util.Date(); 
		this.color = color; 
		this.filled = filled; 
		System.out.println("Geometric Object's Default Constructor 2 is invoked");
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public boolean isFilled() 
	{
		return filled;
	}

	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}

	public java.util.Date getDateCreated() 
	{
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated)
	{
		this.dateCreated = dateCreated;
	}

	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled; 
	}

	public String Output()
	{
		return "Output is from method present in GeometricObject's Class"; 
	}
	
	//Abstract Method getArea()
	public abstract double getArea();
	
	//Abstract Method getPerimeter()
	public abstract double getPerimeter(); 
}
