package day24_CustomMethods_Return;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int[] array = {1,2,3};
        int num = 4;

        int[] newArray = addElement(array,num);

        System.out.println(Arrays.toString(newArray));



    }

    public static int[] addElement(int[] arr, int num){

        int[] newArray = new int[arr.length+1];
        int i = 0;
        for (int each : arr) {

            newArray[i] = each;
            i++;

        }
        newArray[newArray.length-1] = num;

        return newArray;

    }


}
/*
 create a method named addElement that takes one integer array and one integer, the method can add the Integer number
 after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */

