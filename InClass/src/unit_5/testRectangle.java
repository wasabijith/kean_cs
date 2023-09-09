package unit_5;

public class testRectangle 
{
	public static void main(String[] args) 
	{
		//create a rectangle with default length 1 and width 1
		Rectangle rectangle1 = new Rectangle(); 
		System.out.println("The area of the rectangle of length " + rectangle1.length + " and width " + rectangle1.width + " is " + rectangle1.getArea());
		System.out.println("The perimeter of the rectangle of length " + rectangle1.length + " and width " + rectangle1.width + " is " + rectangle1.getPerimeter());
		System.out.println("\t");
		
		//create a rectangle with length 5 and width 6
		Rectangle rectangle2 = new Rectangle(5,6); 
		System.out.println("The area of the rectangle of length " + rectangle2.length + " and width " + rectangle2.width + " is " + rectangle2.getArea());
		System.out.println("The perimeter of the rectangle of length " + rectangle2.length + " and width " + rectangle2.width + " is " + rectangle2.getPerimeter());
		System.out.println("\t");
		
		//create a rectangle with length 7 and width 3
		Rectangle rectangle3 = new Rectangle(7,3); 
		System.out.println("The area of the rectangle of length " + rectangle3.length + " and width " + rectangle3.width + " is " + rectangle3.getArea());
		System.out.println("The perimeter of the rectangle of length " + rectangle3.length + " and width " + rectangle3.width + " is " + rectangle3.getPerimeter());
		System.out.println("\t");
		
		//modify rectangle length to 4 and width to 3 
		rectangle2.setLengthWidth(4,3);
		System.out.println("The area of the modified rectangle of length " + rectangle2.length + " and width " + rectangle2.width + " is " + rectangle2.getArea());
		System.out.println("The perimeter of the modified rectangle of length " + rectangle2.length + " and width " + rectangle2.width + " is " + rectangle2.getPerimeter());

	}
}

class Rectangle 
{
	//the length and width of the rectangle
	int length;
	int width; 

	//constructs the default length and width of the rectangle
	Rectangle()
	{
		length = 1; 
		width = 1; 
	}

	//constructs the rectangle object 
	Rectangle(int newLength, int newWidth)
	{
		length = newLength; 
		width = newWidth; 
	}

	//return the perimeter of the rectangle
	int getPerimeter()
	{
		return 2 *(length + width); 
	}

	//return the area of the rectangle
	int getArea()
	{
		return (length * width); 
	}

	void setLengthWidth(int newLength, int newWidth)
	{
		length = newLength;
		width = newWidth; 
	}
}
