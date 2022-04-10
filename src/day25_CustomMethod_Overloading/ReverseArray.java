package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {


        int[] arr1 = {1,3,5,7,9};
        int[] reversed = reverse(arr1);
        System.out.println(Arrays.toString(reversed));

        char[] arr2 = {'c', 'e', 'n','g','i','z'};
        char[] reversed2 = reverse(arr2);

        System.out.println(Arrays.toString(reversed2));


    }

    //1. Create a method that can reverse an integer array

    public static int[] reverse(int[] arr) {

        int[] reversed = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = arr[i];

        }

        return reversed;

    }
        

    //2. Create a method that can reverse a double array

    public static double[] reverse(double[] arr) {

        double[] reversed = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = arr[i];

        }

        return reversed;

    }
    

    //3. Create a method that can reverse a char array

    public static char[] reverse(char[] arr) {

        char[] reversed = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = arr[i];

        }

        return reversed;

    }


    //4. Create a method that can reverse a String array

    public static String[] reverse(String[] arr) {

        String[] reversed = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = arr[i];

        }

        return reversed;

    }




}

/*
1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */
