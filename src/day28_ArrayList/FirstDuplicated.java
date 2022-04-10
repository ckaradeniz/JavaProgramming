package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer each : list) {

            if (list2.contains(each)){

                System.out.println("first duplicated = " + each);
                break;
            }
           list2.add(each);
        }


    }
}
/*
Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */