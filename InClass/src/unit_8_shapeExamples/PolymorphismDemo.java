package unit_8_shapeExamples;

public class PolymorphismDemo 
{
	public static void main(String[] args)
	{
		//Create Circle and Rectangle as subtypes of GeometricObject 
		GeometricObject obj1 = new Circle(1, "red", false);
		GeometricObject obj2 = new Rectangle(1, 1, "black", true);
		GeometricObject obj3 = new Square(2, "blue", true); 
		
		System.out.println("Circle Details: ");
		System.out.println(obj1.toString());
		
		System.out.println("Rectangle Details: ");
		System.out.println(obj2.toString());
		
		System.out.println("Square Details: ");
		System.out.println(obj3.toString());
		
		//Display circle and rectangle properties
		displayObject(obj1); 
		displayObject(obj2); 
		
//		float f = 12; 
//		int a; 
//		a = (int)f; //Implicit Casting
//		
//		Object o = new Object(); //Object Class
//		System.out.println(o.toString());
//
//		GeometricObject g1 = (GeometricObject)o; //Explicit Casting 
//		System.out.println(o.toString());
		
		GeometricObject obj4 = new Circle(2); 
		System.out.println("Area of circle is " + ((Circle)obj4).getArea());
		
	}	
		//Display geometric object properties 
		public static void displayObject(GeometricObject object)
		{
			System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor()); 
		}
	
		
//		public static void print(Object obj)
//		{
//			
//		}
}

