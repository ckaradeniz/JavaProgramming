package day33_Statics.PracticeTasks;

public class Address {

    public int buildingNumber;
    public String street, city, state, zipcode;


    public static String country = "USA", planet = "Earth";

    public Address(int buildingNumber, String street, String city, String state, String zipcode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String toString() {
        return buildingNumber+" "+street + "\n"+city + " "+state + ", "+zipcode;
    }
}
/*
Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions

		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */