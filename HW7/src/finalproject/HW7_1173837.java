/* 
 * Abijith Manikandan
 * Planning Time: 3 hours
 * Coding Time: 2.2 hours
 * Testing Time: 45 mins 
 * Bug Fixing Time: 15 mins
 */
package finalproject;
import java.io.FileNotFoundException;
import java.time.*;
import java.util.*;

class Car {
	//add data fields
	LocalDate purchaseDate; 
	String brand; 
	String type; 
	String country; 
	double price; 
	
	//add constructors
	
		//empty constructor
		public Car() 
		{
			
		}
		
		//overloaded constructor 
		public Car(LocalDate purchaseDate, String brand, String type, String country, double price)
		{
			this.purchaseDate = purchaseDate; 
			this.brand = brand; 
			this.type = type; 
			this.country = country; 
			this.price = price; 
		}

	//add getters and setters
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;		
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;	
	}
				
	//implement toString()
	@Override 
	public String toString()
	{
		return "Purchase Date: " + purchaseDate + " Brand: " + brand + " Type: " + type + " Country: " + country + " Price: " + price; 
	}
}

class MassMarketCar extends Car { 
	//no data fields
	//add constructors
	
		//empty constructor
		public MassMarketCar() 
		{
			super(); 
		}
		
		//overloaded constructor 
		public MassMarketCar(LocalDate purchaseDate, String brand, String type, String country, double price) 
		{
			super(purchaseDate, brand, type, country, price); 
		}
		
	//implement toString()
	@Override
	public String toString()
	{
		return super.toString(); 
	}
}

class LuxuryCar extends Car {
	//add data fields
	int numOfFeatures; 
	
	//add constructors
	
		//empty constructor 
		public LuxuryCar()
		{
			super(); 
		}
	
		//overloaded constructor 
		public LuxuryCar(LocalDate purchaseDate, String brand, String type, String country, double price, int numOfFeatures)
		{
			super(purchaseDate, brand, type, country, price); 
			this.numOfFeatures = numOfFeatures; 
		}

	//add getters and setters
	public int getNumOfFeatures() {
		return numOfFeatures;
	}

	public void setNumOfFeatures(int numOfFeatures) {
		this.numOfFeatures = numOfFeatures;
	}
		
	//implement toString()
	@Override 
	public String toString() 
	{
		return super.toString() + " Number of Features: " + numOfFeatures; 
	}
}
class SuperLuxuryCar extends LuxuryCar {
	//add data fields
	String exclusiveFeature; 
	
	//add constructors
	
		//empty constructor 
		public SuperLuxuryCar()
		{
			super(); 
		}
		
		//overloaded constructor 
		public SuperLuxuryCar(LocalDate purchaseDate, String brand, String type, String country, double price, int numOfFeatures, String exclusiveFeature)
		{
			super(purchaseDate, brand, type, country, price, numOfFeatures); 
			this.exclusiveFeature = exclusiveFeature; 
		}

	//add getters and setters
	public String getExclusiveFeature() {
		return exclusiveFeature;
	}

	public void setExclusiveFeature(String exclusiveFeature) {
		this.exclusiveFeature = exclusiveFeature;
	}
				
	//implement toString()
	@Override 
	public String toString() 
	{
		return super.toString() + " Exclusive Feature: " + exclusiveFeature; 
	}
} 

/*TASK 5. Implement part 1 of the report.  You need to read data from input.txt 
	file, store it into array of cars (called cars) and write it in a formatted form to
	the output file. Code, Debug and Present in a best format possible. 
	Hint: it might be helpful to format the String coming from toString() method using 
	String.format() method, that works like System.out.prinf().
	Hint2: You might have to close and delete existing output .doc or .txt file from 
	its folder after each run and refresh your project*/

public class HW7_1173837 {
	static Car [] cars = new Car [200];//an array of Cars 
	static LuxuryCar [] luxuryCars;//an array of Luxury Cars 
	static int countLuxuryCars = 0;//count Luxury Cars
	static String pageHeader; //save the header
	//main() method runs the program
	public static void main(String[] args) throws FileNotFoundException {
		double sum = 0, average = 0;
		//Optional - create a new input file for each run (or use the same one)  
		//CreateInput.createInputFile();
		//call the method to read data from input.txt and store in the array of Cars 
		readInputFile();
		// TODO: find the total revenue and the average price for this month
		for (int i = 0; i < cars.length; i++) //test
		{
			sum = cars[i].price + sum; 
		}
		System.out.println("The total revenue is: " + sum);
		average = sum/200; 
		System.out.println("The average sell price is: " + average);

		//create an output file
		java.io.File file = new java.io.File(LocalDate.now().toString() + "_1173837_hw7_report.doc");
		java.io.PrintWriter output = new java.io.PrintWriter(file);//you can rename later
		//Part 1: lists all cars sold in November 2022 by their date 
		output.print("This report prepared on " +  LocalDate.now() + " by 1173837, CPS*2231*01\n\n");
		
		// TODO: Print the header row of the data
		output.print("The Car Online Marketplace Transactions Report for November, 2022, generated on ");

		// TODO: Print all cars into the file (.txt or .doc)
		for (int i = 0; i < cars.length; i++) //test
		{
			output.println(cars[i]);
		} 
		
		// TODO: Display money total and the average price of sold cars at the end of Part 1
		output.println("The total revenue was: " + sum);
	    output.println("The average sell price was: " + average);
		
		/*TASK 6. Implement part 2 of the report.  You need to sort cars by their price and
		 * write it in a formatted form into the same output file, created in Part 1. Code,
		 * Debug and Present in a best format possible. Hint: 
		 * You might have to close and delete existing output file from the folder */

		// TODO: call the method 'sortByPrice' to sort the cars by price.
	    sortByPrice(cars);

		// TODO: next page starts
		output.printf((char)12 +pageHeader.trim());
		
		// TODO: Print the header row of the page and the data
		output.printf(" Luxury cars sorted by price\n\n");
		
		// TODO: Print all cars sorted by price into the same file
		for (int i = 0; i < cars.length; i++) //test
		{
			output.println(cars[i]);
		} 
		
		/*TASK 7. Implement part 3 of the report.  
		 * You need to extract Luxury Cars out of all Cars and store them into the array of Luxury cars. 
		 * Sort this data by the number of special features and write it in a formatted	form into the same 
		 * output file, created in Part 1. Code, Debug and Present in a best format possible. */

		// TODO: create an array of LuxuryCars
		List<LuxuryCar> luxuryList = new ArrayList<>();
		
		for (int i = 0; i < 200; i++) { //test
			if (cars[i] instanceof LuxuryCar) {
				luxuryList.add((LuxuryCar) cars[i]);
			}
		}
		LuxuryCar [] luxuryCars = new LuxuryCar[luxuryList.size()];
		luxuryList.toArray(luxuryCars);

		for (int i = 0; i< luxuryCars.length; i++) {
			System.out.println(luxuryCars[i]);
		}

		// TODO: call the method 'sortByNum' to sort the Luxury Cars by the number of Special Features. 
		sortByNum(luxuryCars); //test
		
		// TODO: next page starts
	    output.printf((char)12 +pageHeader.trim()); 

		// TODO: Print the header row of the page and the data
	    output.printf(" Luxury cars sorted by number of special features\n\n");
		
		// TODO: Print all Luxury Cars sorted by their number of features into the file
		for (int i = 0; i< luxuryCars.length; i++) //test
		{
			output.println(luxuryCars[i]);
		}

		// Close the file
		output.close();


	}
	
	
	//read() method reads the data from the input file - its code is provided to you
	public static void readInputFile() {
		// Declare file and Create a File instance
		java.io.File file = new java.io.File("C:\\Users\\abiji\\eclipse-workspace\\HW7\\src\\input\\input.txt"); 
		//Note: To find path to file on Windows local input.txt properties, to find a path on Mac use https://macpaw.com/how-to/get-file-path-mac

		// Declare a Scanner variable 
		Scanner input = null;
		try {
			System.out.println("input.txt file is read successfully");
			input = new Scanner(file);//file is OK
		} 
		catch (FileNotFoundException e) {//Houston, we've got a problem
			e.printStackTrace();
		}
		// Read data from a file
		pageHeader = input.nextLine() + "\n";//title
		String header2 = input.nextLine() + input.nextLine() + 
				input.nextLine();//table header
		LocalDate localDate = null;
		//till there is something in the file
		int i = 0; //for row
		while (input.hasNextLine() && input.hasNext()) {
			//get data
			localDate= LocalDate.parse(input.next());
			String brand = input.next();
			String country = input.next();
			String type = input.next();
			double price = Integer.parseInt(input.next());

			if (type.equals("Mass-Market")) {//uncomment the line creating an object once your classes are created
				cars[i] = new MassMarketCar(localDate, brand, type, country, price); 
			}

			//populate the items array, some data depends on type
			else {
				int num =  Integer.parseInt(input.next());
				countLuxuryCars++;
				if (type.equals("Luxury")) {//uncomment the line creating an object once your classes are created
					cars[i] = new LuxuryCar(localDate, brand, type, country, price, num);  
				}
				else { //uncomment the line below once your classes are created
					String feature = input.next();
					cars[i] = new SuperLuxuryCar(localDate, brand, type, country, price, num, feature.replace("\"", "")); 
				}
			} 
			i++;
		}

		// Close the file
		input.close();
	}

	//Task 8 
	
	//sortByPrice() method sorts the cars by their price. 
	//You can use any Sorting algorithm you want; some useful links are there in Appendix.
	public static void sortByPrice(Car[] list ) { 
		//TODO: provide your own algorithm using any sorting method of your choice
		 boolean needNextPass = true;
		    
		    for (int k = 1; k < list.length && needNextPass; k++) {
		      // Array may be sorted and next pass not needed
		      needNextPass = false;
		      for (int i = 0; i < list.length - k; i++) {
		        if (list[i].price > list[i + 1].price) {
		          // Swap list[i] with list[i + 1]
		          double temp = list[i].price;
		          list[i].price = list[i + 1].price;
		          list[i + 1].price = temp;
		          
		          needNextPass = true; // Next pass still needed
		        }
		      }
		    }
		  }
	    

	// sortByNum() method sorts the Luxury cars by number of their features. 
	//You can use any Sorting algorithm you want; some useful links are there in Appendix.
	public static void sortByNum(LuxuryCar[] list ) {
		//TODO: provide your own algorithm using any sorting method of your choice
		 boolean needNextPass = true;
		    
		    for (int k = 1; k < list.length && needNextPass; k++) {
		      // Array may be sorted and next pass not needed
		      needNextPass = false;
		      for (int i = 0; i < list.length - k; i++) {
		        if (list[i].numOfFeatures > list[i + 1].numOfFeatures) {
		          // Swap list[i] with list[i + 1]
		          int temp = (int) list[i].numOfFeatures;
		          list[i].numOfFeatures = list[i + 1].numOfFeatures;
		          list[i + 1].numOfFeatures = temp;
		          
		          needNextPass = true; // Next pass still needed
		        }
		      }
		   }
	}
	}
