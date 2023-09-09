package unit_5;

public class testCircle 
{
	public static void main(String[] args) 
	{
		//create a circle with radius 1 
		Circle circle1 = new Circle(); 
		System.out.println("The area of the circle of radius " + circle1.radius + " is " +  circle1.getArea());

		//create a circle with radius 25 
		Circle circle2 = new Circle(25); 
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

		//create a circle with radius 125 
		Circle circle3 = new Circle(125); 
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

		//modify circle radius 
		circle2.setRadius(100);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	}
}
class Circle 
{
	//the radius of the circle
	double radius; 

	//constructs the circle object 
	Circle()
	{
		radius = 1; 
	}

	//constructs the circle object 
	Circle(double newRadius)
	{
		radius = newRadius; 
	}

	//return the area of the circle 
	double getArea()
	{
		return (Math.PI*(Math.pow(radius, 2))); 
	}

	//return the perimeter of the circle 
	double getPerimeter()
	{
		return (2 * radius * Math.PI); 
	}

	void setRadius(double newRadius)
	{
		radius = newRadius; 
	}

	public static void printAreas(Circle c, int count)
	{
		System.out.println("Radius\t\tArea");
		while (count >= 1)
		{
			c.setRadius(count);
			System.out.println(c.radius+ "\t\t" + c.getArea());
			count--; 
		}
	}
	
	//
}
