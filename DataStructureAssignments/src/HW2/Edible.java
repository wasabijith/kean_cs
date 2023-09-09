package HW2;
public interface Edible 
{
	public abstract String howToEat(); 
	public default String howToCook()
	{
		return null;
	}
}
