package unit_8_personExamples;

public class Customer extends Person
{
	//Data Fields 
	private double balance; 

	//Constructor 
	Customer(String name, String address, double balance)
	{
		super(name, address); 
		this.balance = balance; 
	}

	//Getters and Setters 
	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	//Implement the abstract method printInfo() 
	@Override 
	public String printInfo() 
	{
		return "The customer name: " + super.getName() + ". The customer address: " + super.getAddress() + ". The customer balance: " + getBalance(); 
	}
}
