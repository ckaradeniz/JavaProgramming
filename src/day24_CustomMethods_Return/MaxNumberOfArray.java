package day24_CustomMethods_Return;

public class MaxNumberOfArray {

    public static void main(String[] args) {


        int[] arr = {2,4,6,4,5,8,7};

        int maxNum = maxNumberOfArray(arr);

        System.out.println(maxNum);


    }

    public static int maxNumberOfArray(int[] arr){

        int max = 0;
        for (int each : arr) {

            if (each > max){
                max = each;
            }

        }

        return max;



    }



}
/*
create a method that can return the maximum number from an array of integers
 */
