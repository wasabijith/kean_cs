package Lab2;

public class BinarySearch2 {
	public static int binarySearch(int[] list, int key , int group , int end) {
		int r = key;
		if(r>=1) {
			int mid = 1 + (r-1)/2;

			if(list[mid] == group)
				return mid;

			if(list[mid] < group)
				return binarySearch(list , mid +1 , end , group);
			//
			return binarySearch(list , mid +1 , end , group);
			//
		}
		return -1;

	}



	public static void main(String[] args) {
		// int n= 4;
		int searchValue = -3;
		int[] list = {-3, 1, 2, 4, 9, 23};
		int result2 = binarySearch(list , 0 ,list.length -1 , searchValue);
		long startTime2 = System.nanoTime();
		for(int i = 0; i <list.length; i++) {
			list[i] = i;

		}
		long endtime = System.nanoTime();
		long done = endtime - startTime2;

		if (searchValue == -1)
			System.out.println("Element not present in the array");
		else
			System.out.println("Element found at index " + searchValue);


		System.out.println("The time in nanoseconds is " + done);

	}
}
