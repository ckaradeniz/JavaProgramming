package day15_ForLoop;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.next();


        int result = 0;

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if (c >= '0' && c <= '9'){

                result += c - 48;

            }
        }

        System.out.println(result);

    }
}
/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 49   ==> 1
						             	   		...
 */