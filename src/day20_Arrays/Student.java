package day20_Arrays;

public class Student {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char[] grades = new char[names.length];



        String eachName = "";
        int eachScore = 0;
        char grade = 'A';
        for (int i = 0; i < names.length; i++) {

            eachName = names[i];

            eachScore = scores[i];

            grades[i] = grade;

            grade++;

            System.out.println(eachName + "'s score is " + eachScore + " and grade is " + grades[i] );
        }






    }
}
/*
given the following arrays:


         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */