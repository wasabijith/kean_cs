package Lab_5;

public class test {
	public static void main(String[] args) 
	{
		System.out.print(myMethod(3));
	}
	
	public static long  myMethod(long index) {
        if (index == 0) 
                return 0;
       else if (index == 1) 
               return 1;
       else 
                 return  myMethod(index - 1) + 2;
   }
}
