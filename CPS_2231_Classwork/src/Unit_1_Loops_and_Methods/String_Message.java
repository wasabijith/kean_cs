package Unit_1_Loops_and_Methods;

public class String_Message 
{
	public static void main(String[] args) 
	{
		String message = "Welcome to Java"; 
		System.out.println("Find char: " + message.charAt(3));
		System.out.println("Length of the message: " + message.length());
		System.out.println("To Uppercase: " + message.toUpperCase());
		System.out.println("To Lowercase: " + message.toLowerCase());
		System.out.println("Beginning Index: " + message.substring(0)); 
		System.out.println("Range of Index: " + message.substring(0, 11)); 
		
		// Concat function
		String message2 = " and goodbye.";
		String newResult = message.concat(message2); 
		System.out.println(newResult);
		
		// Replace function
		String word = "Soak";
		String newWord = word.replace('k', 'r');
		System.out.println("New word after replacing is: " + newWord);
		
		String c1 = "Science, Arts and Arts Major"; 
		String c2 = c1.replaceFirst("Arts", "Math"); 
		System.out.println("New word after replacing is: " + c2);
	}
}