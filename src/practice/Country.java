package practice;

public class Country {

		  // Static variable
		  static int countryCounter;

		  String name;
		  int dummyCounter;

		  public static void main(String[] args) {
			  System.out.println(countryCounter);
		    // Creating first instance
		    Country ob1 = new Country();

		    // Assigning values to object's data variables.
		    ob1.name = "India";
		    ob1.dummyCounter = 1;

		    ++ob1.countryCounter;

		    // Creating second instance of the class
		    Country ob2 = new Country();
		    ob2.name = "france";
		    ob2.dummyCounter = 1;

		    ++ob2.countryCounter;
		    

		    System.out.println("ob1.countryCounter = " + ob1.countryCounter);
		    System.out.println("ob2.countryCounter = " + ob2.countryCounter);
		    System.out.println("Country.countryCounter = " + Country.countryCounter);
		  }
		


}
