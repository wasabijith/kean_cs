package unit_1;

public class FindAverage {

	public static void main(String[] args) {
		double [] myList = new double[100]; 
		System.out.println(myList.length);
		System.out.println(myList[0]);
		System.out.println(myList[myList.length-1]);
		myList[0] = 2.3; 
		myList[1] = 3.2; 
		myList[2] = myList[0] + myList[1]; 
		System.out.println(myList[2]);
		
		int [] myList1 = new int[100]; 
		System.out.println(myList.length);
		System.out.println(myList[0]);
		System.out.println(myList[myList.length-1]);
		
		boolean [] myList2 = new boolean[100]; 
		System.out.println(myList.length);
		System.out.println(myList[0]);
		System.out.println(myList[myList.length-1]);
		
		char [] myList3 = new char[100]; 
		System.out.println(myList.length);
		System.out.println(myList[0]);
		System.out.println(myList[myList.length-1]);
	}

}
