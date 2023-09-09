package unit_8;

public class Comparable 
{
	public static void main(String[] args)
	{
		//Comparing integers
		System.out.println(new Integer(3).compareTo(new Integer(5)));
		System.out.println(new Integer(7).compareTo(new Integer(5)));
		System.out.println(new Integer(5).compareTo(new Integer(5)));
		
		//Comparing text
		System.out.println("ABC".compareTo("ABE"));
		System.out.println("ABC".compareTo("ABC"));
		
		//Comparing dates
		java.util.Date date1  = new java.util.Date(2013, 1, 1); 
		java.util.Date date2 = new java.util.Date(2012, 1, 1);
		System.out.println(date1.compareTo(date2));
	}
}
