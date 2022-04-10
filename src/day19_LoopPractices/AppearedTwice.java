package day19_LoopPractices;

public class AppearedTwice {

    public static void main(String[] args) {

        String str = "abccdeefggh";
        String result = "";



        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (result.contains(""+ch)){


                System.out.println(ch);
            }
            result += ch;



        }

    }
}
/*
3. Write a program that can display all the characters that appeared
twice in the string.
 */