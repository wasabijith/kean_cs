package Unit_1_Loops_and_Methods;

public class Math_Class 
{
	public static void main(String[] args) 
	{
		System.out.println(Math.exp(1));
		float f1 = 2.71f ; 
		System.out.println(Math.log(f1));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(3.5, 2.5));
		int t = 100; 
		System.out.println(Math.sqrt(t));
		
		// 	Rounded up
		System.out.println(Math.ceil(2.1));
		
		//	Rounded down
		System.out.println(Math.floor(2.1));
		
		//	Normal rounding 
		System.out.println(Math.round(2.1));
		
		//	Maximum 
		System.out.println("Maximum is: " + Math.max(3.0, 4.0));
		
		//	Absolute value 
		System.out.println("Absolute value is: " + Math.abs(-3.1));
		
		// Random value 
		int result; 
		result = (int)(Math.random() * 10); // between 0 and 9
		System.out.println("Random value is: " + result ); 
		
		System.out.println("Random value without type casting: " + Math.random() * 10); // between 0 and 9 but in double value
		
		// Returns a random number between a and a + b excluding a + b
		System.out.println(50 + (int)(Math.random() * 50));  
	}
}
