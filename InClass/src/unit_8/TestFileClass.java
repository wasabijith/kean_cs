package unit_8;
import java.io.File;
//move this file
public class TestFileClass 
{
	  public static void main(String[] args) throws java.io.IOException 
	  {
	    File file = new java.io.File("C:\\Users\\abiji\\eclipse-workspace\\InClass\\NewJava");
	    System.out.println("Does it exist? " + file.exists());
	    System.out.println("The file has " + file.length() + " bytes");
	    System.out.println("Can it be read? " + file.canRead());
	    System.out.println("Can it be written? " + file.canWrite());
	    System.out.println("Is it a directory? " + file.isDirectory());
	    System.out.println("Is it a file? " + file.isFile());
	    System.out.println("Is it absolute? " + file.isAbsolute());
	    System.out.println("Is it hidden? " + file.isHidden());
	    System.out.println("Absolute path is " +
	      file.getAbsolutePath());
	    System.out.println("Last modified on " +
	      new java.util.Date(file.lastModified()));
	    //Rename 
	    File f2 = new File("NewJava.jpg"); 
	    System.out.println("Is the rename successful? " + file.renameTo(f2));
	   
	    //Return Canonical Path for the file object
	    System.out.println("Canonical Path " + file.getCanonicalPath());
	    
	    //Create a new file
	    File f3 = new File("sample.txt");
	    System.out.println("Is the file sample.txt created? " + f3.createNewFile());
	    
	    //Create a new folder 
	    File f4 = new File("C:\\Users\\abiji\\eclipse-workspace\\InClass\\newFolder");
	    System.out.println("Is the new folder created? " + f4.mkdir());
	    
	    //Delete a file 
	    System.out.println("Is the file sample.txt deleted? " + f3.delete());
	    
	  }
}