package week10;

public class DifferenceBetweenMaxAndMin {

    public static void main(String[] args) {
        
        int[] arr = {2,37,5,7,97};

        System.out.println(difference(arr));


    }
    
    
    public static int difference(int[] arr){

        int max = arr[0];
        int min = arr[0];
        for (int each : arr) {
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
            
        }
        return max - min;
    }

    /*
     public static int difference(int[] arr) {
        int diff = 0;

        int max = Integer.MIN_VALUE; // int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        diff = max - min ;
        return diff;
    }
     */

}
