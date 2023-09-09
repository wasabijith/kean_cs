package unit_8;

public class example1  
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
	}
	
	//Dog class
	class Dog
	{
		//Data Fields
		int age; 
		String gender; 
		String owner; 	
		
		//Default Constructor
		public Dog()
		{
			this.age = 2; 
			this.gender = "Female"; 
			this.owner = "Unknown"; 
		}
		
		public Dog(int a, String g, String o)
		{
			this.age = a; 
			this.gender = g; 
			this.owner = o; 
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
	class Elephant 
	{
		//Data Fields 
		int age; 
		String gender; 
		String zooName; 
		
		//Default Constructor 
		public Elephant ()
		{
			this.age = 2; 
			this.gender = "Female";
			this.zooName = "Unknown"; 
		}

		public Elephant (int a, String g, String z)
		{
			this.age = a; 
			this.gender = g; 
			this.zooName = z; 
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
