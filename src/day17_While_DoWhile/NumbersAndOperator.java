package day17_While_DoWhile;

import java.util.Scanner;

public class NumbersAndOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result = 0;

       while(true) {

           System.out.println("Enter first number:");
           int num1 = scan.nextInt();
           System.out.println("Enter second number:");
           int num2 = scan.nextInt();
           System.out.println("Enter a math operator:");
           char operator = scan.next().charAt(0);

           while (operator != '+' && operator != '-' && operator != '*' && operator != '/'){

               System.out.println("Operator is invalid, please re-enter:");
               operator = scan.next().charAt(0);

           }

           if (operator == '+'){
               result = num1 + num2;
           }
           if (operator == '-'){
               result = num1 - num2;
           }
           if (operator == '*'){
               result = num1 * num2;
           }
           if (operator == '/'){
               result = num1 / num2;
           }

           System.out.println("Result: " + result);

       }


    }
}
/*
write a program to ask user to enter two number and math operator, and return the result.
if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */