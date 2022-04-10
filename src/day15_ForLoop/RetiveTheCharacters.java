package day15_ForLoop;

import java.util.Scanner;

public class RetiveTheCharacters {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'a'&& c <= 'z' || c >= 'A' && c <= 'Z'){
                letters += c;
            }else if(c >= '0' && c <= '9'){
                digits += c;
            }else{
                specialChars += c;
            }
        }
        System.out.println("letters: " + letters + "\ndigits: " + digits + "\nspecial chars: " + specialChars);




    }
}

/*
 write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */