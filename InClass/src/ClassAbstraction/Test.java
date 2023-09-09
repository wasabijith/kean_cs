package ClassAbstraction;

public class Test 
{
	public static void main(String[]args)
	{
		//GeometricObject obj0 = new GeometricObject(); Invalid
		GeometricObject obj1 = new Circle(3); //Valid
		GeometricObject obj2 = new Rectangle(3,4); //Valid
		// Circle c1 = new Circle(2); //Valid 
		
		System.out.println(obj1.getArea()); //Area of Circle
		System.out.println(obj2.getArea()); //Area of Rectangle 
	}
}
