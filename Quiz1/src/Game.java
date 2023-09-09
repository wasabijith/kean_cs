import java.util.List; 
import java.util.LinkedList; 

public class Game <D, A> implements Playable <D, A>
{
	//Variables
	private D Device; 
	private A Age; 
	
	//Default Constructor 
	public Game() 
	{
		
	}
	
	//Overloaded Constructor 
	public Game(D Device, A Age)
	{
		this.Device = Device; 
		this.Age = Age; 
	}
	
	//Setters and Getters 
	public D getDevice() 
	{
		return Device;
	}

	public void setDevice(D device) 
	{
		Device = device;
	}

	public A getAge() 
	{
		return Age;
	}

	public void setAge(A age) 
	{
		Age = age;
	}
	
	public static <E> void playThemAll(List<E> gameList)
	{
		for(E element : gameList)
			System.out.println(element);
	}
	
	@Override 
	public D whatToPlayOn() 
	{
		return Device; 
	}
	
	@Override
	public void howToPlay(D t) 
	{
		System.out.println("This is the device you are playing on: " + Device);
		System.out.println("Make sure to connect your controllers and play with a friend!");
	}
	
	@Override 
	public void getAgeGroup(A a)
	{
		System.out.println("This is the age required to play: " + a);
	}
	
	//toString method 
	public String toString() 
	{
		return "\nThis is the device you are playing on: " + 
				Device + "\nThis is the age required to play: " + Age; 
	}
	
	public static void main(String[] args)
	{
		Game<String, Integer> game1 = new Game<>("Xbox", 5);
		Game<String, Integer> game2 = new Game<>("Xbox", 18);
		Game<String, Integer> game3 = new Game<>("PS4", 18);
		Game<String, Integer> game4 = new Game<>("PC", 4);

		List<Game<String, Integer>> gameList = new LinkedList<>(); 
		gameList.add(game1);
		gameList.add(game2); 
		gameList.add(game3); 
		gameList.add(game4); 
		
		Game.playThemAll(gameList);
	}
}
