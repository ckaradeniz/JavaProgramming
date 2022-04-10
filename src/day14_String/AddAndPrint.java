package day14_String;

import java.util.Scanner;

public class AddAndPrint {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String first = input.next();

        System.out.println("Enter second word:");
        String second = input.next();

        char firstLast = first.charAt(first.length()-1);
        char secondFirst = second.charAt(0);



       if (firstLast == secondFirst){
           System.out.println(first.substring(0 , first.length()-1) + second);
       }else{
            System.out.println(first + " " + second);
       }
        input.close();



    }
}
/*
 4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last word is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */

