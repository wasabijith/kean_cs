package HW_7;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CreateInput {

	/* main method */
	public static void main(String[] args) {
		//create the unique input file for this assignment 
		createInputFile();
	}

	/* createInputFile() method generates random transaction data */
	static void createInputFile(){//used path to your project
		//	java.io.File file = new java.io.File("C:\\Users\\galae\\eclipse-workspace\\CPS2231\\src\\finalproject\\input.txt");
		java.io.File file = new java.io.File("input.txt");
		java.io.PrintWriter output = null;
		try {
			output = new java.io.PrintWriter(file);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//generate 200 random purchase dates
		String [] dates = new String [200];
		Random random = new Random();

		for (int i=0; i < 200; i++) {
			LocalDate date = LocalDate.of(2022, 11, random.nextInt(29)+1);   
			dates[i] =date.toString();
		}

		/* sort the dates */
		Arrays.sort(dates);

		//array of cars and their types
		String [][] cars = {
				{ "Toyota", "Japan","Mass-Market"}, {"Honda", "Japan","Mass-Market"}, {"Chevrolet", "USA","Mass-Market"}, {"Ford", "USA","Mass-Market"},  {"Mercedes-Benz","Germany","Luxury"}, 
				{"Jeep","USA","Mass-Market"}, {"BMW","Germany","Luxury"}, {"Porsche","Germany","Luxury"}, {"Subaru","Japan","Mass-Market"}, {"Nissan","Japan","Mass-Market"}, 
				{"Cadillac","USA","Luxury"}, {"Volkswagen","Germany","Mass-Market"}, {"Lexus","Japan","Luxury"}, {"Audi","Germany","Luxury"}, {"Ferrari","Italy","Super-Luxury"}, 
				{"Volvo", "Sweden", "Luxury"}, {"Jaguar", "UK","Luxury"}, {"GMC","USA","Mass-Market"}, {"Buick","USA","Mass-Market"}, {"Acura","Japan","Luxury"}, 
				{"Bentley","UK","Super-Luxury"}, {"Dodge","USA","Mass-Market"}, {"Hyundai","ROK","Mass-Market"}, {"Lincoln","USA","Luxury"}, {"Mazda", "Japan","Mass-Market"}, 
				{"Land_Rover", "UK","Luxury"}, {"Tesla","USA","Luxury"}, {"Maserati","Italy","Super-Luxury"}, {"Aston_Martin","UK","Super-Luxury"}, {"Peugeot", "France","Mass-Market"},
				{"Renault", "France","Mass-Market"}, {"Genesis","ROK","Luxury"}
		};

		String [] exclusiveFeatures = {"Celestial_Headliner","LED_Projectors","Cabin_Atomizer_Fragrance", "Massage_Seats", "Mood_Lighting", "Heated_And_Cooled_Cupholders", "Folding_Tables", "Satellite-Aided_Car_Transmission"};

		//Print the header
		output.printf("%25s%20s\n\n","","The Car Online Marketplace Transactions Report for November, 2022, generated on " + LocalDate.now());
		output.printf("%-15s%-20s%-20s%-18s%-20s%-20s\n\n","Purchase Date", "Car Brand", "Country", "Car Type", "Price, $", "Special & Exclusive Feature(s)");

		//Print the transactions based on item type
		for (int i = 0; i < dates.length; i++) {
			int index1 = (int) (Math.random()*cars.length);
			output.printf("%-15s%-20s%-20s%-15s",dates[i], "\"" + cars[index1][0] + "\"", cars[index1][1], cars[index1][2]);

			//print price and special features based on type		
			if (cars[index1][2] == "Mass-Market") 
				output.printf("%10d\n", random.nextInt(20000)+10000);

			else  if (cars[index1][2] == "Luxury") 
				output.printf("%10d%10d\n", random.nextInt(20000)+40000,random.nextInt(10)+1); //# of Special features


			else {//Super-Luxury
				int index = random.nextInt(exclusiveFeatures.length);
				output.printf("%10d%10d%35s\n", random.nextInt(20000)+70000,random.nextInt(10)+1, exclusiveFeatures[index]); 
			}
		}
		// Close the file
		output.close();
	}
}

