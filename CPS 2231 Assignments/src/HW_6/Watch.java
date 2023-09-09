package HW_6;

public abstract class Watch implements Timer
{
	//Main method
	public static void main(String[] args)
	{
		Watch w1 = new AnalogWatch("Tissot", "Leather", 299.99, 3);
		Watch w2 = new DigitalWatch("Timex", "Stainless Steel", 199.99, 24);
		System.out.println("Time: " + w1.getCurrentTime());
		System.out.println(w1.howToChangeWatchTime());
		System.out.println();
		System.out.println("Description of the analog watch: \n" + w1.toString());
		System.out.println();
		System.out.println("Time: " + w2.getCurrentTime());
		System.out.println(w2.howToChangeWatchTime());
		System.out.println();
		System.out.println("Description of the digital watch: \n" + w2.toString());
	}
	
	//Data fields 
	private String brand; 
	private String material; 
	private double price; 
	
	//Constructor 
	public Watch()
	{
		
	}
	
	//Constructor 
	public Watch(String brand, String material, double price)	
	{
		this.brand = brand; 
		this.material = material; 
		this.price = price; 
	}

	//Getters and setters 
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String getBrand() 
	{
		return brand;
	}

	public void setMaterial(String material)
	{
		this.material = material;
	}
	
	public String getMaterial() 
	{
		return material;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	//Abstract method
	public abstract boolean isWaterProof(); 
	
	//toString 
	public String toString()
	{
		return "\nThe brand name is: " + brand + ". \nThe material is: " + material + ". \nThe price is: " + price + ". \nIs it waterproof: " + isWaterProof(); 
	}
	
}
