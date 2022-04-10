package day23_CustomMethos_Void;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        anagram("melek", "kelem");

    }


    public static void anagram(String first, String second){
        char firstChar[] = first.toCharArray();
        char secondChar[] = second.toCharArray();

        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        if (Arrays.equals(firstChar,secondChar)){
            System.out.println(first + " and " + second + " are anagram");
        }else{
            System.out.println(first + " and " + second + " are NOT anagram");
        }

    }

}
/*
 17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */