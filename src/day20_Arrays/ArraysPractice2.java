package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char [] letters = new char[26];

         /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */

        /*for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++){

            letters[j] = i;
        }
        */

         /*
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }
         */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {

            letters[i] = ch; // ch++;
            //ch++;

        }

        System.out.println(Arrays.toString(letters));

        System.out.println("-----------------------------------------------");

        char[] letters2 = new char[26]; // Z-A

        char ch2 = 'Z';
        for (int i = 0; i < letters2.length ; i++) {

            letters2[i] = ch2--;

        }
        System.out.println(Arrays.toString(letters2));




    }
}
