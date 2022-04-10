package day20_Arrays;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[array1.length];


        for (int i = array1.length - 1, j = 0; i >= 0; i--, j++) {

            reversedArray[j] = array1[i];


        }
        System.out.println(Arrays.toString(reversedArray));


    }
}
/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */