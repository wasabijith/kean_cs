package Largest;
import java.util.ArrayList;


public class LargestOfFive {
	public static void main (String args[]) {       

		System.out.println("123");
         int max = 0;
         for(int i = 0; i<5; i++) {
        	 //if(args.length>0) {
        		 System.out.println("in");     

        		 int num = Integer.parseInt(args[i]);      
         
        	if(num>max) {
     		max = Integer.parseInt(args[i]);
        	}}
         //}
 System.out.println(max);     
}
}
