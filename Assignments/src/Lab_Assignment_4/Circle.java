package Lab_Assignment_4;

enum Color
{
	WHITE, YELLOW, RED, GREEN, BLUE, BROWN, BLACK; 
}

public class Circle 
{
	double radius = 1.0; 
	Color color; 
	public Circle(double radius, Color color) 
	{
		//super();
		this.radius = radius;
		this.color = color;
	}
	
	public Circle(Color color) 
	{
		//super();
		this.color = color;
	}
	public Circle(double radius) 
	{
		//super();
		this.radius = radius;
	}

	public Circle() 
	{
		//super();
		// TODO Auto-generated constructor stub
	}

	public double getRadius() 
	{
		return radius;
	}
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	public Color getColor() 
	{
		return color;
	}
	public void setColor(Color color) 
	{
		this.color = color;
	}
	@Override
	public String toString() 
	{
		return "The circle characteristics are: radius = " 
				+ radius + ", color = " + color + ", diameter = " + getDiameter() 
				+ ", perimeter = " + getPerimeter() + ", area = " + getArea();
	}
	public double getDiameter()
	{
		return radius*2; 
	}
	public double getArea()
	{
		return radius*radius*Math.PI; 
	}
	public double getPerimeter()
	{
		return 2*Math.PI*radius; 
	}

}
