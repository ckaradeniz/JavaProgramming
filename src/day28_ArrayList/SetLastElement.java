package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SetLastElement {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        
        numbers.set(numbers.size()-1,0);

        System.out.println("numbers = " + numbers);


    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
 */