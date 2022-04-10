package day23_CustomMethos_Void;

public class PrintEachChar {

    public static void main(String[] args) {


        printEachChar("cengiz");


    }

    public static void printEachChar(String string){

        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");

        }
    }

}
/*

	13. create a method named printEachChar that can print each characters of a string
 */