package day23_CustomMethos_Void;

public class OddAndEvenNumbers1To100 {


    public static void main(String[] args) {


        oddNumbers1To100();

        System.out.println();

        evenNumbers1To100();


    }
    //1. create a method that can print odd numbers between 1~100 in a same line saperated by space

    public static void oddNumbers1To100(){

        for (int i = 1; i <= 100; i+=2) {

            System.out.print(i + " ");

        }

    }


    //2. create a method that can print even numbers between 1~100 in a same line saperated by space

    public static void evenNumbers1To100(){

        for (int i = 2; i <= 100 ; i+=2) {
            System.out.print(i+ " ");

        }
    }


}
