package day24_CustomMethods_Return;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] rev = reverseArray(arr);

        System.out.println(Arrays.toString(rev));


    }

    public static int[] reverseArray(int[] array){
        int[] reversed = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {

            reversed[j] += array[i];

        }
        return reversed;

    }





}
/*
create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}
 */
