package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price = 0;
        int totalPrice = 0;
        String anotherRoom = "";
        String bedroom = "";
        int night = 0;

        do {


            System.out.println("Which bedroom do you want to reserve? (King / Queen / Single)");
            System.out.println("King Bed ==> 120$");
            System.out.println("Queen Bed ==> 100$");
            System.out.println("Single Bed ==> 80$");
            bedroom = scan.next().toLowerCase();

            while (!(bedroom.equals("king") || bedroom.equals("queen") || bedroom.equals("single"))) {

                System.err.println("Invalid entry, please re-enter");
                System.out.println("Which bedroom do you want to reserve? (King / Queen / Single)");
                bedroom = scan.next().toLowerCase();
            }

            System.out.println("How many nights will you stay:");
            night = scan.nextInt();

            night += night;


            System.out.println("Would you like to reserve another room? (Yes / No)");
            anotherRoom = scan.next().toLowerCase();

            while (!(anotherRoom.equals("yes") || anotherRoom.equals("no"))) {

                System.err.println("Invalid entry, please re-enter");
                System.out.println("Would you like to reserve another room? (Yes / No)");
                anotherRoom = scan.next().toLowerCase();
            }



        }while (anotherRoom.equals("yes"));





        if (bedroom.equals("king")){
            price = 120;
        }else if (bedroom.equals("queen")){
            price = 100;
        }else {
            price = 80;
        }

        totalPrice = (price * night);

        System.out.println("Total price is " + totalPrice);


    }
}
/*
Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
 */