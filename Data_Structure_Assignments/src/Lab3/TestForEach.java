package Lab3;

import java.util.*;

public class TestForEach 
{
  public static void main(String[] args) 
  {
    Collection<String> collection = new ArrayList<>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    collection.forEach(e -> System.out.print(e.toUpperCase() + " "));
    
    System.out.println();
    
    //Task 4.2 (using Abijith's Kean ID)
    Collection<Integer> collection2 = new ArrayList<>();
    collection2.add(1); 
    collection2.add(1); 
    collection2.add(7); 
    collection2.add(3); 
    collection2.add(8); 
    collection2.add(3); 
    collection2.add(7); 
    
    System.out.println("Kean ID: 1 1 7 3 8 3 7");
    
    collection2.forEach(e -> System.out.print(e * 2 + " ")); 

    //Task 4.3 (using Abijith's Kean ID) 
    System.out.println();
    collection2.forEach(e -> System.out.print(Math.pow(e, 2) + " "));
    
    //Task 4.4 (using Abijith's Kean ID) 
    System.out.println();
    collection2.forEach(e -> System.out.print(Math.log(e) + " "));
    
  }
}