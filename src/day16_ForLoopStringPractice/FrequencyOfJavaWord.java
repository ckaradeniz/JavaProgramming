package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfJavaWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scan.nextLine();

        int result = 0;

        for (int i = 0; i <= input.length()-4; i++) {

            String java = input.substring(i, i+4);

            if (java.equalsIgnoreCase("java")){

                result++;
            }

        }
        System.out.println(result);





    }








}
/*
write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
Hint: you need to create
 */