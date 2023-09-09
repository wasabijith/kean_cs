package unit_2;

public class returningArrayfromMethod {

	public static void main(String[] args) {
		int [] list = {3,1,6,4,2};
		int [] newlist = new int[list.length];
		newlist = addMethod(list); 
		System.out.println("New Array is \n");
		for (int i = 0; i < newlist.length; i++)
		{
			System.out.println(newlist[i] + " ");
		}
	}
	
	public static int [] addMethod(int[] arr)
	{
		int[] result = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			result[i] = arr[i]+3;
		}
		return result; 
	}

}
