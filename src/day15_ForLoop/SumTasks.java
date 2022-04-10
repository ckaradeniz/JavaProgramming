package day15_ForLoop;

import java.util.Scanner;

public class SumTasks {

    public static void main(String[] args) {

        // Write a program that can return the sum of even numbers between 1 and 100

        int sum = 0;

        for (int i = 2; i <= 100; i += 2) {

            if (i % 2 == 0) {

                sum += i;
            }

        }
        System.out.println(sum);

        System.out.println("----------------------------------------");

        //Write a program that can return the sum of odd numbers between 1 and 100

        int sum2 = 0;

        for (int i = 1; i < 100; i++) {

            if (i % 2 == 1) {

                sum2 += i;
            }

        }
        System.out.println(sum2);

        System.out.println("------------------------------------------------");

        //write a program that can calculate the sum of all numbers between 1 to any given number
        //            ex:
        //                input: 100
        //                output: 5050
        //
        //                input: 50
        //                output: 1275

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = scan.nextInt();
        int sum3 = 0;

        if (i > 0) {

            for (; i >= 1; i--) {
                sum3 += i;

            }
            System.out.println(sum3);

        } else {

            for (; i <= 1; i++) {
                sum3 += i;
            }
            System.out.println(sum3);

        }


    }
}
