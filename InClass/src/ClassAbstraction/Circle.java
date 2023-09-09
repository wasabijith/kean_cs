package ClassAbstraction;

public class Circle extends GeometricObject
{
	//Data Field 
	private double radius;

	//Default Constructor
	public Circle()
	{
		super(); 
	}

	//Default Constructor 
	public Circle(double radius)
	{
		super(); 
		this.radius = radius; 
	}

	//Another Constructor 
	public Circle(double radius, String color, boolean filled)
	{
		super(color, filled); 
		this.radius = radius; 
		setColor(color); 
		setFilled(filled); 
	}

	//Getters and Setters 
	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	@Override
	public double getArea()
	{
		return radius*radius*Math.PI; 
	}

	public double getDiameter()
	{
		return 2*radius; 
	}

	@Override 
	public double getPerimeter()
	{
		return 2*radius*Math.PI; 
	}

	public void printCircle()
	{
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}

	@Override
	public String Output() 
	{
		return "Output is from method present in Circle Class"; 
	}

	public String Output (int a)
	{
		return "Output of int is from method present in Circle Class " + a; 
	}

	public String toString() 
	{
		return "Circle [getRadius()= " + getRadius() + ", getArea ()= " + ", getDiameter()= " + getDiameter() + ", getPerimeter()= " + getPerimeter() + "\n" + super.toString() + "]"; 
	}	
}
