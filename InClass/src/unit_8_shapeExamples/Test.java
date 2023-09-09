package unit_8_shapeExamples;

public class Test 
{
	public static void main(String[] args) 
	{
		//Object for Circle 
		Circle c0 = new Circle(); 
		System.out.println("The radius is " + c0.getRadius()); //Invokes Constructor Circle() and gets radius 
		System.out.println("The area is " + c0.getArea()); //Invokes 
		System.out.println("The diameter is " + c0.getDiameter()); //Invokes
		System.out.println("The properties of the circle are " + c0.getColor() + ", " + c0.isFilled() + ", " + c0.getDateCreated());
		System.out.println(c0.Output());
		System.out.println(c0.Output(3));
		
		System.out.println();
		
		//Object for Circle
		Circle c1 = new Circle(1); //Invokes constructor Circle(double radius) and creates circle
		//System.out.println("A circle " + c1.toString()); //Invokes parent method toString()
		//System.out.println("The color is " + c1.getColor()); //Invokes parent method getColor()
		System.out.println("The radius is " + c1.getRadius()); //Invokes own method
		System.out.println("The area is " + c1.getArea()); //Invokes own method
		System.out.println("The diameter is " + c1.getArea()); //Invokes own method
		System.out.println("The properties of the circle are " + c1.getColor() + ", " + c1.isFilled() + ", " + c1.getDateCreated());

		System.out.println();
		
		//Object for Circle 
		Circle c2 = new Circle(2, "Green", true); //Invokes Constructor Circle(double radius) and creates a circle
		//System.out.println("The color is " + c2.getColor()); //Invokes parent method getColor()
		System.out.println("The radius is " + c2.getRadius()); //Invokes own method
		System.out.println("The area is " + c2.getArea()); //Invokes own method
		System.out.println("The diameter is " + c2.getArea()); //Invokes own method
		System.out.println("The properties of the circle are " + c2.getColor() + ", " + c2.isFilled() + ", " + c2.getDateCreated());
		
		System.out.println();
		
		//Object for Rectangle
		Rectangle r1 = new Rectangle (2, 4); //Invoke constructor rectangle(double width, double length) 
		System.out.println("\nA rectangle " + r1.toString()); //Invokes own method
		System.out.println("The area is " + r1.getArea()); //Invokes own method
		System.out.println("The perimeter is " + r1.getPerimeter()); //Invokes own method
		System.out.println("The properties of the rectangle are " + r1.getColor() + ", " + r1.isFilled() + ", " + r1.getDateCreated());

		
		System.out.println();
		
		//Object for Square 
		Square s1 = new Square(3, "Red", true); 
		System.out.println("The area is " + s1.getArea()); //Invokes own method
		System.out.println("The perimeter is " + s1.getPerimeter()); //Invokes own method
		System.out.println("The properties of the rectangle are " + s1.getColor() + ", " + s1.isFilled() + ", " + s1.getDateCreated());
	}
}
