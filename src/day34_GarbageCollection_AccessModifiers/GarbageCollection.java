package day34_GarbageCollection_AccessModifiers;


import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        /*
        //int n = null;
        String str = null;
        System.out.println( str.toUpperCase() );

         */

        String str = "Wooden Spoon";// after line 13 "Wooden Spoon" will be eligible for garbage collection
        str = null;


        System.out.println(str);//null


        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1);//null

        System.out.println("--------------------------------------");


        Dog dog1 = new Dog(); // eligible to garbage collection
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);//max


        String languge = "Python";
        languge = "Java";

        System.out.println(languge);//Java

        System.out.println("---------------------------------------------");


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);//[100, 200, 300, 400]
        System.out.println(list2);//[100, 200, 300, 400]

        System.out.println(list1 == list2);//true


        System.out.println("---------------------------------------------");


        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);//Student{name='Ahmet', age=30, gender=M, grade=A, id=14}
        System.out.println(student2);//Student{name='Ahmet', age=30, gender=M, grade=A, id=14}

        System.out.println("---------------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        
        
        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);//l1 = [Java, Python]
        System.out.println("l2 = " + l2);//l2 = [Java, Python]
 


    }
}
