package day21_ForEachLoop;

import java.util.Arrays;

public class NumOfAppearances {

    public static void main(String[] args) {

        String words = ("number of appearances of java and python anywhere in the sentence java java python");

        String[] eachWord = words.split(" ");

        int countJava = 0;
        int countPython = 0;
        
        for (String each : eachWord) {
            
            if (each.equals("java")){
                countJava++;
            }
            if (each.equals("python")){
                countPython++;
            }
            
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);






    }
}
/*
Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

 */