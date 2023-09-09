package HW2;
public class Sushi implements Edible
{
	//Data Field
	public String name; 
	public boolean hasCrab; 
	
	//Empty Constructor
	public Sushi()
	{
		
	}
	
	//Constructor
	public Sushi(String name, boolean hasCrab)
	{
		this.name = name; 
		this.hasCrab = hasCrab; 
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

	public boolean isHasCrab() 
	{
		return hasCrab;
	}

	public void setHasCrab(boolean hasCrab) 
	{
		this.hasCrab = hasCrab;
	}

	//Implementation of abstract and default methods
	@Override
	public String howToEat()
	{
		 return "Yum! Sushi can be eaten with soy sauce on the side and ginger to cleanse the taste. Simply take a piece of sushi and dip it slightly in soy sauce. Then put it in your mouth!"; 
	}
	
	@Override 
	public String howToCook() 
	{
		return "Carefully place the rice on the seaweed. Add your preferred toppings on the rice and then proceed to wrap the roll completely. Make sure to wrap the roll tightly! After wrapping cut to thin slices and enjoy!"; 
	}
		
	//toString method 
	public String toString()
	{
		return "\t\nSushi name: " + name + "\nDoes it have crab?: " + hasCrab + "\nHow you cook the sushi: " + howToCook() + "\nHow you eat the sushi: " + howToEat() + "\n"; 
	}
}
