package day17_While_DoWhile;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        int result = 0;

        while(num1 >= num2){

           num1 = num1 - num2;

           result++;

        }
        System.out.println(result);


    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */