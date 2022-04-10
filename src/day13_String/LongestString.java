package day13_String;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first sentence:");
        String first = scan.nextLine();
        System.out.println("Enter second sentence:");
        String second = scan.nextLine();

        int firstTotal = first.length();
        int secondTotal = second.length();

        if (firstTotal>secondTotal){
            System.out.println("Longest string is: "+first);
        }else {
            System.out.println("Longest string is: "+ second);
        }
        scan.close();


    }
}
/*

2. write a program that asks user to enter two strings, and print out the longest string
 */