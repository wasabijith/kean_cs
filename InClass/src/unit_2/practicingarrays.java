package unit_2;

public class practicingarrays {

	public static void main(String[] args) {
		int[] arr = {15, 32, 14, 68, 42};
		int sum = 0; 
		for (int element: arr)
		{
			System.out.println("Element is: " + element);
			sum += element; 
		}
		System.out.println("The total is: " + sum);
	}

}
