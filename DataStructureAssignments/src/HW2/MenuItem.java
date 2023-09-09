package HW2;
import java.util.ArrayList;
import java.util.List;

public class MenuItem <F, P> implements Servable <F,P>
{
	private F food; 
	private P price; 
	
	public MenuItem ()
	{
		
	}
	
	public MenuItem (F food, P price)
	{
		this.food = food; 
		this.price = price; 
	}
	
	//Interface methods
	@Override
	public F whatToServe() 
	{
		return food;
	}

	@Override
	public void printPrice() 
	{
		System.out.println("The price is: " + price);
	}

	@Override
	public void displayItem(Servable <F, P> s) 
	{
		System.out.println("Item being served: " + s.whatToServe());
	}
	
	//Setters and Getters 
	public F getFood() 
	{
		return food;
	}

	public void setFood(F food) 
	{
		this.food = food;
	}

	public P getPrice() 
	{
		return price;
	}

	public void setPrice(P price) 
	{
		this.price = price;
	}

	public static <E> void displayAllOrder(List <E> foods)
	{
		System.out.println("Menu Item: ");
		for (E food: foods)
		{
			System.out.println(foods);
		}
	}
	
	public String toString() 
	{
		return "The menu item is: " + food + ". The price is: " + price; 
	}
	
	//Main method
	public static void main (String[] args)
	{
		//Part 6A
		List<MenuItem<String, Integer>> menuList1 = new ArrayList<>();
		MenuItem<String, Integer> item1 = new MenuItem<>("Burger", 6); 
		menuList1.add(item1);
		MenuItem<String, Integer> item2 = new MenuItem<>("Salad", 4); 
		menuList1.add(item2);
		MenuItem.displayAllOrder(menuList1);
		
		System.out.println();
		
		//Part 6B
		List<MenuItem<String, Double>> menuList2 = new ArrayList<>();
		MenuItem<String, Double> item3 = new MenuItem<>("Ramen", 6.99); 
		menuList2.add(item3);
		MenuItem<String, Double> item4 = new MenuItem<>("Pulled Pork", 12.49); 
		menuList2.add(item4);
		MenuItem.displayAllOrder(menuList2);
		
		System.out.println(); 
		
		//Part 6C
		Edible sushi = new Sushi("California Roll", true); 
		Edible soup = new Soup("Clam Chowder", "Creamy");
	
		List<MenuItem<Edible, Double>> menuList3 = new ArrayList<>();
		MenuItem<Edible, Double> item5 = new MenuItem<>(sushi, 4.99); 
		menuList3.add(item5);
		MenuItem<Edible, Double> item6 = new MenuItem<>(soup, 2.49); 
		menuList3.add(item6);
		MenuItem.displayAllOrder(menuList3);
	}
}
