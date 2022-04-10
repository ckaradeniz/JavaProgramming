package day13_String;

import java.util.Scanner;

public class AskAString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = scan.nextLine();

        String result = "";

        if (str.length() == 0){
            result = "string is empty";
        }else if  (str.length() > 3){
            int lastIndex = str.length() -1;
            result = ""+str.charAt(lastIndex - 2) + str.charAt(lastIndex-1) + str.charAt(lastIndex);
        }else{
            result = str;
        }


        System.out.println(result);
        scan.close();

    }
}
/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */