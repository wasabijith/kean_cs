package unit_8;

public class superclassExample 
{
	public static void main(String[] args) 
	{
		//Create Objects for Animal 
		Animal a1 = new Animal (12, "Male");
		System.out.println(a1.getAge() + " " + a1.getGender());
		
		//Create Object for child class - Dog
		Dog d1 = new Dog(8, "Female", "Nike"); 
	}
}
//Super Class is Animal 
class Animal 
{
	//Data Fields 
	int age; 
	String gender; 

	//Default Constructor
	Animal()
	{

	}
	//Another Constructor 
	Animal(int age, String gender)
	{
		this.age = age; 
		this.gender = gender; 
	}
	//Setter and Getter methods 
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
}
//Child Class - Dog 
class Dog extends Animal 
{
	//Data Field 
	String ownerName;

	//Default Constructor 
	Dog()
	{

	}
	//Another Constructor 
	Dog(int age, String gender, String ownerName)
	{
		super(); 
		setAge(age); 
		setGender(gender); 
		this.ownerName = ownerName; 
	}
	//Setters and Getters 
	public String getOwnerName() 
	{
		return ownerName;
	}
	public void setOwnerName(String ownerName) 
	{
		this.ownerName = ownerName;
	}
	public String toString()
	{
		return "The details are"; 
	}
}
