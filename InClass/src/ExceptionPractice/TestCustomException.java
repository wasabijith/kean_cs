package ExceptionPractice;

public class TestCustomException 
{	
	public static void main(String[] args) 
	{
		int number1 = 10; 
		int number2 = 0; 

		try 
		{
			System.out.println("Number1 / Number2 is: " + (number1/number2));
		}

		catch(DividebyZeroException ex) 
		{
			System.out.println("Divisor is zero.");
		}

		finally
		{
			System.out.println("The program is over.");
		}
	}

	public static int divideMethod(int n1, int n2) throws DividebyZeroException //Declare the Custom Exception
	{
		if(n2 == 0)
		{
			throw new DividebyZeroException("Divisor cannot be zero"); //Throwing the Custom Exception
		}
		return n1/n2;
	}

	class DividebyZeroException extends Exception //Custom class for exception 
	{
		public DividebyZeroException(String message) //Constructor with one argument 
		{
			super(message);
		}
	}

}