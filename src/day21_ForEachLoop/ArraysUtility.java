package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        System.out.println(nums); // hashcode // [I@45c8e616
        System.out.println(Arrays.toString(nums)); //[1, 2, 3, 4, 5]

        System.out.println(nums[3]); //4

        System.out.println("--------------------------------------------------------------");


        int[] scores = {85, 94, 67, 55, 83, 72};

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));//[55, 67, 72, 83, 85, 94]

        System.out.println("min number is "+ scores[0]); //55
        System.out.println("max number is "+ scores[scores.length-1]);//94


        String[] names = {"Gunay", "Anna", "Zuhal" ,"Ahmet", "Maria", "Sinem"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names)); // [Ahmet, Anna, Gunay, Maria, Sinem, Zuhal]

        String[] words = {"Anna", "ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words)); //[ANNA, Anna]

        System.out.println("------------------------------------------------------------------------------");


        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r = Arrays.equals(arr1, arr2);

        System.out.println(r); //false

        Arrays.sort(arr1); //1,2,3
        Arrays.sort(arr2); //1,2,3

        boolean r2 = Arrays.equals(arr1,arr2);

        System.out.println(r2); //true

        System.out.println("-------------------------------------------------------");

        //"acb" , "bac"
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1); //{a, b, c}
        Arrays.sort(ch2); //{a, b, c}

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram); //anagram = true






    }
}
