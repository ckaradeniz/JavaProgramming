package day27_WrapperClasses;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        arr = swap(arr,1,3);

        System.out.println(Arrays.toString(arr));

        char[] ch = {'A', 'b', 'C', 'd'};

        ch = swap(ch, 0, 2);

        System.out.println(Arrays.toString(ch));


    }
    //swaps the element at index i with the element at index j, and returns the new array
    public static int[] swap(int[] array, int i, int j){

        if (i < 0 || i >= array.length){
            System.err.println("Invalid Index: " + i);
            System.exit(0);
        }
        if (j < 0 || j >= array.length){
            System.err.println("Invalid Index: " + j);
            System.exit(0);
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        
        return array;

    }


    //swaps the element at index i with the element at index j, and returns the new array
    public static double[] swap(double[] array, int i, int j){

        if (i < 0 || i >= array.length){
            System.err.println("Invalid Index: " + i);
            System.exit(0);
        }
        if (j < 0 || j >= array.length){
            System.err.println("Invalid Index: " + j);
            System.exit(0);
        }

        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;

    }


    //swaps the element at index i with the element at index j, and returns the new array
    public static char[] swap(char[] array, int i, int j){

        if (i < 0 || i >= array.length){
            System.err.println("Invalid Index: " + i);
            System.exit(0);
        }
        if (j < 0 || j >= array.length){
            System.err.println("Invalid Index: " + j);
            System.exit(0);
        }

        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;

    }


    //swaps the element at index i with the element at index j, and returns the new array
    public static String[] swap(String[] array, int i, int j){

        if (i < 0 || i >= array.length){
            System.err.println("Invalid Index: " + i);
            System.exit(0);
        }
        if (j < 0 || j >= array.length){
            System.err.println("Invalid Index: " + j);
            System.exit(0);
        }

        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;

    }


}
/*
Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps
	the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array

 */
