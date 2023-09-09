public class Exercise_1 
{
	public static void main(String[] args) 
	{
		// implement a loop of your choice here
		for (int num = 20; num <= 40; num++) 
		{
			System.out.printf("%-2d%8.2f\n", num, myRoot(num));
		}
	}

	// Method that calculates the square root of integer variables
	public static double myRoot(int number) 
	{
		double root;
		root = number / 2;
		double root_old;
		do {
			root_old = root;
			root = (root_old + number / root_old) / 2;
		} while (Math.abs(root_old - root) > 1.0E-6);
		return root;
	}

	// Method that calculates the square root of double variables
	public static double myRoot(double number) 
	{
		double root;
		root = number / 2;
		double root_old;
		do {
			root_old = root;
			root = (root_old + number / root_old) / 2;
		} while (Math.abs(root_old - root) > 1.0E-6);
		return root;
	}
}
