package day24_CustomMethods_Return;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] newArray = merge(arr1,arr2);

        System.out.println(Arrays.toString(newArray));



    }

    public static int[] merge(int[] arr1, int[] arr2){

        int[] newArray = new int[arr1.length+ arr2.length];

        int i = 0;
        for (int each : arr1) {

           newArray[i++] = each;

        }
        for (int each : arr2) {

            newArray[i++] = each;

        }

        return newArray;



    }

}
/*

	7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays
	and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */