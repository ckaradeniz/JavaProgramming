package day13_String;

import java.util.Scanner;

public class IsTheSame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = input.nextLine();

        char first = str1.charAt(0);
        char last = str1.charAt(str1.length()-1);

        boolean isTheSame = first == last;

        if (isTheSame){
            System.out.println("same");
        }else {
            System.out.println("different");
        }
        input.close();

    }
}
/*
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */