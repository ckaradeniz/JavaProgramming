package day24_CustomMethods_Return;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] array = {345,765,325,876,9876,35,7655,};

        int minNum = minNumberOfArray(array);

        System.out.println(minNum);



    }
    public static int minNumberOfArray(int[] arr){

        int min = 2147483647;
        for (int each : arr) {

            if (each < min){

                min = each;
            }

        }
        return min;

    }


}
/*
create a method that can return the minimum number from an array of integers
 */
