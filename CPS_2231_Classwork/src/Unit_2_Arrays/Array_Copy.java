package Unit_2_Arrays;

import java.util.Arrays;

public class Array_Copy {

	public static void main(String[] args) {
		int[] a = {3,8,10};	//	Source array 
		int[] b = new int[a.length];	//	Target array 	
		
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println("Target: " + Arrays.toString(b));
	}

}
