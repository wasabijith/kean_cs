package Lab3;
import java.util.*;

public class TestQueue 
{
	  public static void main(String[] args) 
	  {
	    Queue<String> queue = new LinkedList<>();
	    queue.offer("Oklahoma");
	    queue.offer("Indiana");
	    queue.offer("Georgia");
	    queue.offer("Texas");

	    while (queue.size() > 0)
	      System.out.print(queue.remove() + " ");
	    
	    //New instance of queue
	    Queue<Integer> queue2 = new LinkedList<>(); 
	    queue2.add(2); 
	    queue2.element(2); 
	    queue2.offer(3); 
	    queue2.peek(2); 
	    queue2.poll(5); 
	    queue2.remove(2);
	  }
}