package HW2;

public class EdibleTest 
{
	public static void main(String[] args) 
	{
		//Two instances of soup 
		Soup s1 = new Soup("Clam Chowder", "Creamy");
		Soup s2 = new Soup("Chicken Noodle", "Watery"); 
		
		//Two instances of sushi
		Sushi s3 = new Sushi("California Roll", true); 
		Sushi s4 = new Sushi("Avocado Roll", false); 
		
		Edible[] edibleArray = {s1, s2, s3, s4}; 
		
    	int count = 0;
       
    	//Formatting as table
        for (Edible food: edibleArray)
        {
        	if(food instanceof Soup)
        	{
            	System.out.println("-----------------------------------------------");
            	System.out.println("Recipe #"+ (count+1));

        		System.out.println(edibleArray[count]);
        		count++;
        	}
        	if(food instanceof Sushi)
        	{
            	System.out.println("-----------------------------------------------");
            	System.out.println("Recipe #"+ (count+1));

        		System.out.println(edibleArray[count]);
        		count++;
        	}
        
        }
        	    System.out.println("-----------------------------------------------");
	}
}
