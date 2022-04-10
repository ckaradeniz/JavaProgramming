package day19_LoopPractices;

public class IndexOfFirstDuplicated {

    public static void main(String[] args) {

        String str = "abccdddd";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) != str.lastIndexOf(ch)){

                System.out.println(str.indexOf(ch));

                break;
            }

        }



    }
}
/*
2. Write a program that cna return the index number of the first
duplicated character from a string
 */