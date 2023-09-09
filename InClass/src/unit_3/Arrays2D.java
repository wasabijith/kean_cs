package unit_3;

import java.util.Arrays;

public class Arrays2D {

	public static void main(String[] args) {
		double [][] a2 =
			{
					{2,5,9},
					{5,8,5}, 
					{9,6,7}
			}; 
		System.out.println(Arrays.deepToString(a2));
		System.out.println("a2.length is " + a2.length);
		System.out.println("a2[0].length is " + a2[0].length);
	}

}
