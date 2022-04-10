package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeTwoElement {


    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};

        int[] merged = merge(arr1,arr2);

        System.out.println(Arrays.toString(merged));

        System.out.println("------------------------------------------------");

        double[] arr3 = {3.4,5.6};
        double[] arr4 = {7.8,8.9};

        double[] merged2 = merge(arr3,arr4);

        System.out.println(Arrays.toString(merged2));

        System.out.println("------------------------------------------------");


        char[] arr5 = {'A', 'B'};
        char[] arr6 = {'C','D'};

        char[] merged3 = merge(arr5,arr6);

        System.out.println(Arrays.toString(merged3));

        System.out.println("------------------------------------------------");

        String[] arr7 = {"ali", "ahmet"};
        String[] arr8 = {"hasan", "huseyin"};

        String[] merged4 = merge(arr7,arr8);

        System.out.println(Arrays.toString(merged4));






    }

    //1. create a method that can merge two integer arrays.
    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length+ arr2.length];

        int i = 0;
        for (int each : arr1) {

            result[i++] = each;
        }
        for (int each : arr2) {

            result[i++] = each;

        }

        return result;

    }


    //2. create a method that can merge two double arrays.
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = new double[arr1.length+ arr2.length];

        int i = 0;
        for (double each : arr1) {

            result[i++] = each;
        }
        for (double each : arr2) {

            result[i++] = each;

        }

        return result;

    }


    //3. create a method that can merge two char arrays.
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = new char[arr1.length+ arr2.length];

        int i = 0;
        for (char each : arr1) {

            result[i++] = each;
        }
        for (char each : arr2) {

            result[i++] = each;

        }

        return result;

    }


    //4. create a method that can merge two String arrays.
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = new String[arr1.length + arr2.length];

        int i = 0;
        for (String each : arr1) {

            result[i++] = each;
        }
        for (String each : arr2) {

            result[i++] = each;

        }

        return result;

    }

}
/*
    1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

 */