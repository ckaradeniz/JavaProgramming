package day14_String;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email address:");
        String email = input.nextLine();

        String newEmail = "";

        if (email.indexOf("_") >= 0){

            int underScore = email.indexOf("_");

            String firstName = email.substring(0 , underScore);
            String lastName = email.substring(underScore + 1 , email.indexOf("@"));

            newEmail = lastName + "_" + firstName + email.substring(email.indexOf("@"));

            System.out.println(newEmail);

        }else{

            System.out.println(email);
        }



        input.close();


    }
}
/*

Create a class called EmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */