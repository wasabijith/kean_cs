/*******************************************************************************  
 * Kean University  
 * Fall 2022
 * Course: CPS*2231 - Computer Programming  
 * Author: Abijith Manikandan, CPS 2231, Section 01  
 * Homework: 5, TestPolymorphism.java Program 
 * Description: TestPolymorphism class
 *************************************************************************/  
package HW_5;

public class TestPolymorphism 
{
	public static void main(String[] args)
	{
		//Part a 
		Fruit fruit1 = new Fruit(Color.YELLOW, 310, 2.99); 
		Fruit fruit2 = new Fruit(Color.ORANGE, 250, 1.99); 

		//Part b 
		System.out.println("The total number of fruits are: " + Fruit.getNumberOfFruits()); 

		//Part c
		Fruit apple1 = new Apple(); 

		//Part d
		Fruit apple2 = new Apple("Envy", "Crisp", Color.RED, 135, 1.02); 

		//Part e
		Fruit grape1 = new Grapes(); 
		Fruit grape2 = new Grapes("Sour", true, Color.PURPLE, 60, .69); 

		//Part f 
		System.out.println("The total number of fruits are: " + Fruit.getNumberOfFruits()); 

		System.out.println();

		//Part g
		System.out.println("The actual class of fruit1 is "+ fruit1.getClass());
		System.out.println("The actual class of fruit2 is "+ fruit2.getClass());
		System.out.println("The actual class of apple1 is "+ apple1.getClass());
		System.out.println("The actual class of apple2 is "+ apple2.getClass());

		//Part h (provide an explanation of output on doc)
		System.out.println("Are objects fruit1 and apple1 equal?: "+ (fruit1).equals(apple1));

		System.out.println();

		//Part i 
		System.out.println("The actual class of grape1 is "+ grape1.getClass());
		System.out.println("The actual class of grape2 is "+ grape2.getClass());

		//Part j (provide an explanation of output on doc)
		System.out.println("Are objects fruit2 and grape2 equal?: "+ (fruit2).equals(grape2));

		System.out.println();

		//Part k (answer the question on doc)
		//System.out.println(apple2.getTexture());

		//Part l (answer the question on doc)
		//System.out.println(grape2.getTaste()); 

		//Part m (provide an explanation of output on doc) 
		System.out.println("The texture of apple2 is: " + ((Apple)apple2).getTexture());

		//Part n (provide an explanation of output on doc) 
		System.out.println("The taste of grape2 is: " + ((Grapes)grape2).getTaste());

		//Part o (answer the question on doc) 
 		
		//Part r 
		displayObject(fruit1.toString());
		displayObject(fruit2);
		displayObject(apple1);
		displayObject(apple2);
		displayObject(grape1);
		displayObject(grape2);
	}

	//Part p 
	public static void displayObject(Object obj) 
	{
		//Part q 
		if(obj instanceof Fruit && !(obj instanceof Apple) && !(obj instanceof Grapes))
		{
			System.out.println("This object is an instance of Fruit: " + obj.toString());
		}
		else if(obj instanceof Apple)
		{
			System.out.println("This object is an instance of Apple: " + obj.toString());
		}
		else if(obj instanceof Grapes)
		{
			System.out.println("This object is an instance of Grapes: " + obj.toString());
		}
		else
		{
			System.out.println("Error. This object is not defined.");
		}
	}
}
