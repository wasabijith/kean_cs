package unit_8_personExamples;

public class Employee extends Person 
{
	//Data Field 
	private double salary; 
	
	//Constructor 
	Employee(String name, String address, double salary)
	{
		super(name, address); 
		this.salary = salary; 
	}
	
	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	//Implement the abstract method printInfo() 
	@Override 
	public String printInfo() 
	{
		return "The Employee name: " + super.getName() + ". The employee address: " + super.getAddress() + ". The employee salary: " + getSalary(); 
	}
}
