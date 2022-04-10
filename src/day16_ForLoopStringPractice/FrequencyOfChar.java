package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        System.out.println("Enter a char:");
        String ch = scan.next();

        int numOfChar = 0;

        for (int i = 0; i < str.length(); i++){

            if (ch.equalsIgnoreCase(""+(str.charAt(i)))){
                numOfChar++;
            }

        }
        System.out.println(numOfChar);



    }
}
/*
Write a program that asks user to entera string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */