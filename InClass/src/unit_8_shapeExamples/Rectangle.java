package unit_8_shapeExamples;

//Child class - Rectangle
class Rectangle extends GeometricObject 
{
	//Data Field 
	private double width; 
	private double height; 
	
	//Default Constructor (need)
	public Rectangle()
	{
		super(); 
	}
	
	//Another Constructor (for assigning width and height) (need)
	public Rectangle(double width, double height)
	{
		super(); 
		this.width = width; 
		this.height = height; 
	}
	
	//Another Constructor (for assigning width, height, filled, boolean) (optional?)
	public Rectangle(double width, double height, String color, boolean filled)
	{
		super(color, filled); 
		this.width = width; 
		this.height = height; 
		setColor(color); 
		setFilled(filled); 
	}

	public double getWidth() 
	{
		return width;
	}

	public void setWidth(double width) 
	{
		this.width = width;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	public double getArea() 
	{
		return width * height; 
	}
	
	public double getPerimeter() 
	{
		return 2*(width + height);
	}
	
	public void printRectangle()
	{
		System.out.println("The rectangle is created " + getDateCreated() + " and the width is " + width + " the height is " + height);
	}
	
	public String toString() 
	{
		return "Rectangle [getWidth()= " + getWidth() + ", getHeight ()= " + getHeight() + ", getArea()= " + getArea() + ", getPerimeter()= " + getPerimeter() + "\n" + super.toString() + "]"; 
	}
}

