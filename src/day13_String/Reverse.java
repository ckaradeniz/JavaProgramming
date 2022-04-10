package day13_String;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();
        String result = "";

        if (word.length() < 5){
            result = "Too short!";
        }else if (word.length() > 5){
            result = "Too long!";
        }else {
            result = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        }
        System.out.println(result);

        input.close();



    }
}
/*
Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */