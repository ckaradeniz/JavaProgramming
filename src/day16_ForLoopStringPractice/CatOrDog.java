package day16_ForLoopStringPractice;

import java.util.Scanner;

public class CatOrDog {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scan.nextLine();

        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i <= str.length()-3; i++){

            String catOrDog = str.substring(i, i+3);


            if(catOrDog.equalsIgnoreCase("cat")){
                countCat++;
            }
            if (catOrDog.equalsIgnoreCase("dog")){
                countDog++;
            }

        }
        if (countCat == countDog ){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }
}
/*
write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */