package unit_1;

public class IncrementDecrementPractice 
{
	public static void main(String[] args) 
	{
		int i = 10; 
		int newNum = 10* i++; 
		System.out.println(newNum);
		
		int i2 = 10; 
		int newNum2 = 10 * (++i2); 
		System.out.println(newNum2);
	}
}
