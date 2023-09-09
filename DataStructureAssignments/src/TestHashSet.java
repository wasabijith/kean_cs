import java.util.*;

public class TestHashSet 
{
  public static void main(String[] args) 
  {
    // Create a hash set
    Set<String> set = new HashSet<>();

    // Add strings to the set
    set.add("2232");
    set.add("2110"); 
    set.add("2231"); 
    set.add("2240"); 
    System.out.println(set);

    // Display the elements in the hash set
    for (String s: set) {
      System.out.print("Adding the hash of " + s + ", that is " + s.hashCode());\
      hashSum
    }
    
    // Process the elements using a forEach method
    System.out.println();
    System.out.println("Set Size: " + set.size());
  }
}