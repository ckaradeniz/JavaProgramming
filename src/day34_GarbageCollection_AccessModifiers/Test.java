package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;

import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {


        System.out.println(pi);//3.14
        System.out.println(name);//Circle
        System.out.println(numbers);//[10, 20]

        System.out.println("--------------------------------");


        //find sum of 10, 20

        int r1 = sum(10,20);


        //find sum of 100,200

        int r2 = sum(100,200);



        int r3 = subtraction(100,50);


        int r4 = max(1000,2000);

    }
}
