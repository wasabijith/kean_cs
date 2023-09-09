package unit_8_shapeExamples;

//Child class - Square
class Square extends GeometricObject 
{
	//Data Field 
	private double side; 
	
	//Default Constructor 
	public Square()
	{
		super(); 
	}
	
	//Overloaded Constructor 
	public Square(double side)
	{
		super();
		this.side = side; 
	}
	
	//Overloaded Constructor 
	public Square(double side, String color, boolean filled) 
	{
		super(color, filled); 
		this.side = side; 
		setColor(color); 
		setFilled(filled); 
	}

	//Getters and Setters
	public double getSide()
	{
		return side;
	}

	public void setSide(double side) 
	{
		this.side = side;
	}
	
	public double getArea() 
	{
		return side*side; 
	}
	
	public double getPerimeter() 
	{
		return side + side + side + side;
	}
	
	public void printSquare() 
	{
		System.out.println("The square is created " + getDateCreated() + " and the side length is " + side);
	}
	
	@Override
	public String toString() 
	{
		return "Square [getSide()= " + getSide() + ", getArea ()= " + getArea() + ", getPerimeter()= " + getPerimeter() + "\n" + super.toString() + "]"; 
	}
}