package day19_LoopPractices;

public class IndexOfFirstUnique {

    public static void main(String[] args) {

        String str = "aaabbccdeef";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)){

                System.out.println(str.indexOf(ch));

                break;
            }

        }



    }
}
/*
4. Write a program that can return the index number of the first
unique character.
 */