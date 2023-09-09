package unit_8_personExamples;

public abstract class Person //Abstract Parent Class
{
	public static void main(String[] args)
	{
		//Can implement overriden methods (Employee Object)
		Person p1 = new Employee("John", "Morris Avenue, Union, NJ", 3525.76);
		System.out.println(p1.printInfo());
		
		// p1 = new Customer(); //you can do p1 = new Customer() as well but u cannot do e1 = new Customer() 
		
		//Cannot implement overriden methods 
		Employee e1 = new Employee("John", "Morris Avenue, Union, NJ", 3525.76); 
		System.out.println(e1.printInfo());
		
		//Can implement overriden methods (Customer Object)
		Person p2 = new Customer("Jason", "Morris Avenue, Union, NJ", 256.25); 
		System.out.println(p2.printInfo());
	}
	
	
	//Data Fields
	private String name; 
	private String address; 
	
	//Constructor	
	Person(String name, String address)
	{
		this.name = name; 
		this.address = address; 
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

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	//Abstract Method 
	public abstract String printInfo();
}