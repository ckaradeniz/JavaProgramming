package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AllZeros {

    public static void main(String[] args) {

        int[] array1 = {10, 0, 5, 0, 1, 0};

        Arrays.sort(array1);

        int[] reversed = new int[array1.length];

        for (int i = array1.length-1, j = 0; i >= 0 ; i--, j++ ) {

            reversed [j] = array1[i];

        }

        System.out.println(Arrays.toString(reversed));




    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */