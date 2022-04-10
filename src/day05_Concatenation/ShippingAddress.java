package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String  name = "Cengiz Karadeniz",
                buildingNumber = "187",
                streetName = "Bonnikeplein",
                city = "Noordwijk",
                state = "Zuid Holland",
                zipCode = "2201GM";

//        System.out.println(name + "\n" + streetName + " " + buildingNumber + "\n" + city + " - " + state+ " , "+ zipCode );

        String address = name + "\n" + streetName + " " + buildingNumber + "\n" + city + " - " + state+ " , "+ zipCode;

        System.out.println(address);

    }
}
/*
Create a class called ShippingAddress.java
Declare the following variables:

1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode

Use concatenation to print the full address
 */