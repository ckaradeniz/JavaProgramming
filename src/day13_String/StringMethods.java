package day13_String;

import day11_Switch_Scanner.CydeoBatches;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

       /*
       char tenthChar = word.charAt(9);
       System.out.println("tenthChar = " + tenthChar);
       */

        System.out.println("=======================================================");

        String s1 = "Batch EU8 is the best batch. Java Programming Language";

        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length()-1); // last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("=======================================================");

        String str = "Wooden SPOON";
        str = str.toLowerCase();
        System.out.println("str = " + str);

        String sentence = "Today is the great day to learn Java Programming Language.";
        sentence = sentence.toUpperCase();
        System.out.println("sentence = " + sentence);







    }
}
