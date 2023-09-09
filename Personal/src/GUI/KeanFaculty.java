package GUI;

public class KeanFaculty 
{
	        //Data Fields
	        private double salary; 

	        //Empty Constructor 

	        public KeanFaculty()

	        {

	            super();

	        }

	        //Overloaded Constructor 

	        public KeanFaculty(int keanId, String keanEmail, String firstName, String lastName, double salary)

	        {

	              super(keanId, keanEmail, firstName, lastName); 

	              this.salary = salary;

	        }
}
