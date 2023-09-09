package Lab_Assignment_7;
import java.util.ArrayList;

public class Pet 
{
	public void goToVet() 
	{
		System.out.println("My Pet needs to go to Vet ...");
	}
	
	public static void main(String args[])
	{
		Hamster pug = new Hamster(); 
		Pet sally = new Pet(); 
		Pet loki = new Hamster(); 
		Object sunny = new Object(); 
		Object joy = new Pet(); 
		Object mini = new Hamster(); 
		
		ArrayList<Object> myList = new ArrayList<>();
        myList.add(pug);
        myList.add(sally);
        myList.add(loki);
        myList.add(sunny);
        myList.add(joy);
        myList.add(mini);
        myList.forEach(i -> {
            if (i instanceof Hamster) 
            {
                System.out.println("My Pet is cute: so " + (((Hamster) i).cute()) +"!");
                ((Hamster) i).goToVet();
            }
            
            else if (i instanceof Pet)
            {
                ((Pet) i).goToVet();
            }
        }); 
	}
}
