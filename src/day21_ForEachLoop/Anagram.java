package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {


        String str1 = "acdbe";
        String str2 = "dbcaz";

        // write a program that can check if str1 & str2 are build out same characters

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        //  System.out.println(Arrays.toString(ch1));
        //   System.out.println(Arrays.toString(ch2));


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //  System.out.println();

        // System.out.println(Arrays.toString(ch1));
        //  System.out.println(Arrays.toString(ch2));


        boolean anagram = Arrays.equals(arr1, arr2);


        System.out.println("anagram = " + anagram);


    }
}
