package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MinNumber {

    public static void main(String[] args) {

        byte[] arr1 = {2,5,8,9,4};

        byte min = minNumber(arr1);
        System.out.println(min);

        System.out.println("-----------------------------------");

        float[] arr2 = {34,55,77,887,544,33};

        float min2 = minNumber(arr2);
        System.out.println(min2);
        
        
    }
    
    //1. create a method that can return the min number from an integer array
    
    public static int minNumber(int[] numbers){

        Arrays.sort(numbers);
        int minNumber = numbers[0];
        
        return minNumber;
    }
    

	//2. create a method that can return the min number from double array

    public static double minNumber(double[] numbers){

        Arrays.sort(numbers);
        double minNumber = numbers[0];

        return minNumber;
    }
    

	//3. create a method that can return the min number from long array

    public static long minNumber(long[] numbers){

        Arrays.sort(numbers);
        long minNumber = numbers[0];

        return minNumber;
    }
    

	//4. create a method that can return the min number from short array

    public static short minNumber(short[] numbers){

        Arrays.sort(numbers);
        short minNumber = numbers[0];

        return minNumber;
    }
    

	//5. create a method that can return the min number from float array

    public static float minNumber(float[] numbers){

        Arrays.sort(numbers);
        float minNumber = numbers[0];

        return minNumber;
    }
    

	//6. create a method that can return the min number from byte array

    public static byte minNumber(byte[] numbers){

        Arrays.sort(numbers);
        byte minNumber = numbers[0];

        return minNumber;
    }
    




}
/*
1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array

 */
