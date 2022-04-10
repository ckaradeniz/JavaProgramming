package day17_While_DoWhile;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int num = 0;
        int total = 0;

        while (num >= 0) {

            System.out.println("Enter a number:");
            num = scan.nextInt();

            total += num;

            System.out.println("Sum of number is :" + total);
        }


    }
}
/*
	2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */