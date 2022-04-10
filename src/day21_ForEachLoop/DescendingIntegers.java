package day21_ForEachLoop;

import java.util.Arrays;

public class DescendingIntegers {


    public static void main(String[] args) {


        int[] numbers = {1,3,6,7,3,5,8,9};

        Arrays.sort(numbers);

        int[] newNumbers = new int[numbers.length];

        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {

            newNumbers[j] = numbers[i];

        }
        System.out.println(Arrays.toString(newNumbers));


    }
}
/*
1. Write a program that sort the array of integer in descending
order
 */