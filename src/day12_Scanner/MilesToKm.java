package day12_Scanner;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles:");
        int miles = scan.nextInt();

        System.out.println(miles + " miles equal to " + miles*1.609 + " kilometers");

        scan.close();



    }
}
/*
Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */