package day14_String;

import java.util.Scanner;

public class WithoutFirst {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String first = input.next();
        System.out.println("Enter second word:");
        String second = input.next();
        input.close();

        System.out.println(first.substring(1) + second.substring(1));

    }
}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */