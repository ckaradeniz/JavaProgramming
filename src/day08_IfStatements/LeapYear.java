package day08_IfStatements;

public class LeapYear {
    /*

        2. create a class named LeapYear, and write a program that can identify if the given year is leap Year,
        print true if it's leap year, otherwise print false

                Ex:
                     if  year = 2020

                    output:
                        2020 is leap year: true

            Hint: if the number of year can be evenly divisible by 4 (with remainder of zero), it's leap year

     */
    public static void main(String[] args) {

        int year =  2022;

        boolean isLeapYear = year % 4 == 0;

        System.out.println("isLeapYear = " + isLeapYear);

        System.out.println("----------------------------------------------");

        /*
        1. write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
         */

        int a = 10;
        int b = 15;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);





    }
}
