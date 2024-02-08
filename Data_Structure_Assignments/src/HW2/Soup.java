package HW2;
public class Soup implements Edible
{
	//Data Field
	public String name; 
	public String consistency;
	
	//Empty Constructor
	public Soup()
	{
		
	}
	
	//Constructor
	public Soup(String name, String consistency)
	{
		this.name = name; 
		this.consistency = consistency; 
	}
	
	//Setters and Getters
	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getConsistency() 
	{
		return consistency;
	}

	public void setConsistency(String consistency) 
	{
		this.consistency = consistency;
	}

	//Implementation of abstract and default methods
	@Override
	public String howToEat()
	{
		return "Make sure to sip carefully since the soup is hot. Wait for the soup to cool down if needed and slurp up the goodness!"; 
	}
	
	@Override 
	public String howToCook() 
	{
		return "Empty the soup into a bowl and make sure to warm it to your desired preference. Add salt or pepper and top with croutons if you wish."; 
	}
	
	//toString method 
	public String toString()
	{
		return "\t\nSoup name: " + name + "\nConsistency: " + consistency + "\nHow you cook the soup: " + howToCook() + "\nHow you eat the soup: " + howToEat() + "\n"; 
	}
}
