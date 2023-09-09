package unit_8;

public class example2 
{
	public static void main(String[] args)
	{
		//Dog
		Dog d1 = new Dog(); 
		Dog d2 = new Dog(6, "Male", "Nick");
		System.out.println("Dog 1 details: " + d1.getAge() + " " + d1.gender + " " + d1.owner);
		System.out.println("Dog 2 details: " + d2.getAge() + " " + d2.gender + " " + d2.owner);
		System.out.println(d1.bark()); 
		
		System.out.println();
		
		//Elephant 
		Elephant e1 = new Elephant();
		Elephant e2 = new Elephant(6, "Male", "California Zoo");
		System.out.println("Elephant 1 details: " + e1.getAge() + " " + e1.gender + " " + e1.zooName);
		System.out.println("Elephant 2 details: " + e2.getAge() + " " + e2.gender + " " + e2.zooName);
		System.out.println(e1.trumpet());
	}
}	

	//Parent class (Animal) 
	class Animal 
	{
		//Data Fields 
		int age; 
		String gender; 
		
		//Default Constructor 
		Animal()
		{
			age = 3; 
			gender = "Female"; 
		}
		
		//Constructor 
		Animal(int a, String g)
		{
			this.age = a; 
			this.gender = g; 
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
	}
	
	//Dog class
	class Dog extends Animal
	{
		//Data Fields
		String owner; 	
		
		//Default Constructor
		public Dog()
		{
			this.owner = "Unknown"; 
		}
		
		public Dog(int a, String g, String o)
		{
			this.owner = o; 
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}
		
		public String bark()
		{
			String output = "The sound of the dog is bark";
			return output; 
		}
	}
	
	//Elephant class
	class Elephant extends Animal
	{
		//Data Fields  
		String zooName; 
		
		//Default Constructor 
		public Elephant ()
		{
			this.zooName = "Unknown"; 
		}

		public Elephant (int a, String g, String z)
		{
			this.zooName = z; 
		}
	
		public String getZooName() {
			return zooName;
		}

		public void setZooName(String zooName) {
			this.zooName = zooName;
		}
		
		public String trumpet()
		{
			String output = "The sound of the elephant is trumpet";
			return output; 
		}
	}
