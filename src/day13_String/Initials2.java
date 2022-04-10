package day13_String;

import java.util.Scanner;

public class Initials2 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();
        System.out.println("Enter your surname:");
        String surname = input.next();

        char first = name.toUpperCase().charAt(0);

        char second = surname.toUpperCase().charAt(0);

        System.out.println(first+"."+second);

        input.close();
    }
}
/*
write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output

 */