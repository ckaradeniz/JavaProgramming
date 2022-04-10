package day15_ForLoop;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = scan.nextLine();


        for (int i = str.lastIndexOf(str.length()-1); i >= 0; i--){

            str = str + str.charAt(str.length()-1);


        }
        System.out.print(str);

    }
}
/*
1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
 */