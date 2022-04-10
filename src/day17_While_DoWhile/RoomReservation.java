package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? (yes/no)");
        String answer = scan.next().toLowerCase();



        while (!(answer.equals("yes") || answer.equals("no"))){

            System.out.println("Invalid answer, please re-enter");
            System.out.println("Do you want to reserve a room? (yes/no)");
            answer = scan.next().toLowerCase();
        }
        if (answer.equals("no")){
            System.out.println("Have a nice day");
        }else if(answer.equals("yes")){

            System.out.println("Which type of room do you want to reserve? (King/Queen/Single)");
            String typeOfRoom = scan.next().toLowerCase();

            while (!(typeOfRoom.equals("king") || typeOfRoom.equals("queen") || typeOfRoom.equals("single"))){

                System.out.println("Invalid answer, please re-enter");
                System.out.println("Which type of room do you want to reserve? (King/Queen/Single)");
                typeOfRoom = scan.next().toLowerCase();

            }

            if (typeOfRoom.equals("king")){
                System.out.println("King Bed ==> 120$");
            }else if (typeOfRoom.equals("queen")){
                System.out.println("Queen Bed ==> 100$");
            }else if(typeOfRoom.equals("single")) {
                System.out.println("Single Bed ==> 80$");
            }


        }


    }
}
/*
Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */