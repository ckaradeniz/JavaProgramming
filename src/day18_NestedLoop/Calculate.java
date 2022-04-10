package day18_NestedLoop;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String repeat = "";

        while(true){


            System.out.println("Enter the first number:");
            int first = scan.nextInt();

            System.out.println("Enter a math operator : (+,-,/,*)");
            String operator = "" + scan.next().charAt(0);

            while (!(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*"))) {
                System.err.println("Invalid operator, please re-enter");
                System.out.println("Enter a math operator : (+,-,/,*)");
                operator = "" + scan.next().charAt(0);
            }
            System.out.println("Enter the second number:");
            int second = scan.nextInt();

            double result = 0;
            if (operator.equals("+")) {
                result = first + second;
            } else if (operator.equals("-")) {
                result = first - second;
            } else if (operator.equals("/")) {
                result = first / second;
            } else {
                result = first * second;
            }

            System.out.println("Result : " + result);

            System.out.println("Would you like to continue? (yes/no)");
            repeat = scan.next().toLowerCase();

            while (!(repeat.equals("yes") || repeat.equals("no"))) {
                System.err.println("Invalid answer, please re-enter");
                System.out.println("Would you like to continue? (yes/no");
                repeat = scan.next().toLowerCase();
            }

            if (repeat.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");

                break;
            }



        }

    }

}

/*
Write a program that can calculate two numbers.
1. Ask user to enter the first number
2. Ask user to enter a math operator (+,-,/,*)
(if user enters any invalid operator,
repeat this step until user provides a valid operator)
3. Ask user to enter the second number
4. Display the result
5. Ask user if they want to continue?
(yes/no)
if yes ==> repeat the entire steps
if no ==> print "Thanks for using Cydeo
calculator!"
If user enters any invalid entry,  ask
the user to re-enter until user provides a valid entry
 */