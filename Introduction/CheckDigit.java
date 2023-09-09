/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Abijith Manikandan
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        if (a>=b && a>=c && a>=d && a>=e)
        {
            System.out.println(a);
        }
        
        if (b>=a && b>=c && b>=d && b>=e)
        {
            System.out.println(b);
        }

        if (c>=a && c>=b && c>=d && c>=e)
        {
            System.out.println(c);
        }

        if (d>=a && d>=b && d>=c && d>=e)
        {
            System.out.println(d);
        }

        else
            System.out.println(e);
    }
}