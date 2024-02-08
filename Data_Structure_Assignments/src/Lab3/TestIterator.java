package Lab3;

import java.util.*;

public class TestIterator 
{
  public static void main(String[] args) 
  {
    Collection<String> collection = new LinkedList<>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    var iterator = collection.iterator();
    
    for (String cities : collection)
    {
        System.out.print(cities.charAt(0) + " ");
    }
    
    System.out.println();  
  }
}