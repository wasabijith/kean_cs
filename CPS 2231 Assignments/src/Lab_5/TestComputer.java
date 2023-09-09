/*******************************************************************************  
 * Kean University  
 * Fall 2022
 * Course: CPS*2231 - Computer Programming  
 * Author: Abijith Manikandan, CPS 2231, Section 01  
 * Lab Assignment: 5, TestComputer.java Program 
 * Description: TestComputer class
 *************************************************************************/  
package Lab_5;

public class TestComputer 
{
	public static void main(String[] args) 
	{
		//1st Computer Object 
		Computer c1 = new Computer("Inspiron 1545, ", "DELL, ", "April 1, 2020, ", 2); 
		System.out.println(c1.toString());

		//2nd Computer Object
		Computer c2 = new Computer("A2338, ", "Macbook, ", "March 31, 2020, ", 4);
		System.out.println(c2.toString());

		//3rd Computer Object (mimic your own computer!)
		Computer c3 = new Computer("GalaxyBook Pro 360, ", "Samsung, ", "April 28, 2021, ", 4);
		System.out.println(c3.toString());

		System.out.println();
		
		//1st Desktop Object (width, height, model, brandName, manufacturingDate, numberOfCores)
		Desktop d1 = new Desktop(8.86, 20.1, "Alienware Aurora Ryzen™ Edition R14", "DELL", "October 24, 2021", 8);
		System.out.println(d1.toString()); 

		//2nd Desktop Object (width, height, model, brandName, manufacturingDate, numberOfCores)
		Desktop d2 = new Desktop(30.0, 30.0, "ROG Strix Gaming Desktop", "ASUS", "April 27, 2022", 8); 
		System.out.println(d2.toString());

		//1st Laptop Object (weight, model, brandName, manufacturingDate, numberOfCores)
		Laptop l1 = new Laptop(3.0, "M1 MacBook Pro", "Apple", "November 10, 2020", 8); 
		System.out.println(l1.toString());

		//2nd Laptop Object (weight, model, brandName, manufacturingDate, numberOfCores)
		Laptop l2 = new Laptop(6.82, "Titan-GT77-12UX", "MSI", "June 14, 2022", 8); 
		System.out.println(l2.toString());
	}
}
