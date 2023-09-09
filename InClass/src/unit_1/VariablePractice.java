package unit_1;
import java.util.Scanner;

public class VariablePractice 
{
	public static void main(String[] args) 
	{
		//declares a variable for area
		double area; 
		
		//scanner is used to take in the input of the radius
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = input.nextDouble();
		
		//calculates the area of the circle given the radius
		area = (radius)*(radius)*(3.14159); 
		
		//area of the circle is printed
		System.out.println("Area: " + area);
	}
}
