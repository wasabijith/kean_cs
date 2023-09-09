package comparator;

import java.util.*;

//we will compare KeanStudents
class KeanStudent {

 int keanID;
 String firstName;
 String lastName;
 double GPA; 
 enum YearOfStudy{Freshman, Sophomore, Junior, Senior}; 

 public KeanStudent(int keanID, String firstName, String lastName) {
		super();
		this.keanID = keanID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
 
 public KeanStudent(int keanID, String firstName, String lastName, double GPA, enum YearOfStudy)
 {
	 super(); 
	 this.GPA = GPA; 
	 this.YearOfStudy = YearOfStudy; 
 }
 
 @Override
	public String toString() {
		return "KeanStudent [keanID=" + keanID + ", firstName=" + firstName + 
				", lastName=" + lastName + "]" + "GPA: " + GPA + "Class Year" + YearOfStudy;
	}
}

//Comparator to compareByID
class IDComparator implements Comparator<KeanStudent> {

 public int compare(KeanStudent x, KeanStudent y){
     return x.keanID - y.keanID;
 }
}

//Comparator to compareByName
class NameComparator implements Comparator<KeanStudent> {

 public int compare(KeanStudent x, KeanStudent y){
     return x.firstName.compareTo(y.firstName);
 }
}

class YearOfStudyComparator implements Comparator<KeanStudent> {

	 public int compare(KeanStudent x, KeanStudent y){
	     return x.YearOfStudy.compareTo(y.YearOfStudy);
	 }
	}


class GPA implements Comparator<KeanStudent> {

	 public int compare(KeanStudent x, KeanStudent y){
	     return x.GPA.compareTo(y.GPA);
	 }
	}

//test class
public class TestComparator {

 // Main driver method
 public static void main(String[] args){

     ArrayList<KeanStudent> list = new ArrayList<KeanStudent>();

     list.add(new KeanStudent(111, "Paddy", "Considine", 3.92, Freshman));
     list.add(new KeanStudent(221, "Emma", "D'Arcy", 3.02, Sophomore));
     list.add(new KeanStudent(110, "Matt", "Smith", 2.94, Freshman));
     list.add(new KeanStudent(99, "Steve", "Toussaint", 3.56, Senior));
     list.add(new KeanStudent(1173837, "Abijith", "Manikandan", 3.94, Sophomore));
     list.add(new KeanStudent(22, "Jacob", "Johns", 3.23, Freshman));
     list.add(new KeanStudent(11, "Laura", "Mary", 3.26, Senior));
     list.add(new KeanStudent(44, "Toushard", "Toussaint", 3.16, Sophomore));
     list.add(new KeanStudent(77, "Alyssa", "Johnson", 3.06, Junior));
     list.add(new KeanStudent(88, "Henry", "Ford", 3.16, Senior));
     System.out.println("Initially: ");
     list.forEach(System.out::println);

     Collections.sort(list, new IDComparator());
     System.out.println("\nSorted by Kean ID");
     list.forEach(System.out::println);

     Collections.sort(list, new NameComparator());
     System.out.println("\nSorted by name");
     list.forEach(System.out::println);
 }
}