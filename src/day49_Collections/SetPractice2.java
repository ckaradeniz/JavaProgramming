package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);

        /*
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr = set1.toArray(new String[0]);

        System.out.println(set1);//[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]

         */

        System.out.println(Arrays.toString(arr));//[Wooden Spoon, Book, Pen, Phone, Milk, Eggs, Coke, Paper towels]


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(new LinkedHashSet<>(list)) ;

        System.out.println(list);//[1000, 300, 200, 400, 500, 600, 10, 20, 30, 40]


        System.out.println("------------------------------------------------------------------");


        String[] array = {"A","A","B","C"};

        List<String> s = new ArrayList<>(Arrays.asList(array));

        s.addAll(Arrays.asList("E","F","G"));

        System.out.println("------------------------------------------------------------------");

        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        System.out.println("------------------------------------------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";

        //  eabcd
        //  54434


        String result = ""; //e10a4b4c4d3

        //System.out.println(new LinkedHashSet<>(Arrays.asList(str.split(""))));//[e, a, b, c, d]

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {

            result += each + Collections.frequency(Arrays.asList(str.split("")), each);;

        }

        System.out.println(result);//e10a4b4c4d3


        System.out.println("------------------------------------------------------------------");


    }
}
