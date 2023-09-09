package unit_6;

public class Student 
{
	private Name name;
	private Address address; 
	public Student(Name name, Address address)
	{
		super(); 
		this.name = name; 
		this.address = address; 
	}

	public static void main(String[] args)
	{
		Name n = new Name();
		Address a = new Address();
		Student s = new Student(n,a); 
		System.out.println("Student " + s.name.getfName() + " lives on " + s.address.getStreet());		
	}
}
class Name 
{
	private String fName = "John"; 
	private String lName = "address"; 
	public String getfName()
	{
		return fName; 
	}
}

class Address 
{
	private String street = "Times Square";
	public String getStreet()
	{
		return street; 
	}
}

