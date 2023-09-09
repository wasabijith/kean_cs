package Lab_Assignment_6;

public class SortCircles 
{
	public static void main(String[] args) 
	{
		ComparableCircle[] circles = {
				new ComparableCircle(3.4), 
				new ComparableCircle(13.24),
				new ComparableCircle(7.4),
				new ComparableCircle(1.4)};
				java.util.Arrays.sort(circles);
		
		for (Circle circle: circles) 
		{
			System.out.print(circle + " "); 
			System.out.println();
		}
	}
}