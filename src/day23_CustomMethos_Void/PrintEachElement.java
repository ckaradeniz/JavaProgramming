package day23_CustomMethos_Void;

public class PrintEachElement {


    public static void main(String[] args) {

        int[] numbers = {1,2,3};

       printEachElement(numbers);


    }

    public static void printEachElement(int[] numbers){

        for (int i = 0; i < numbers.length; i++){

            System.out.print(numbers[i]);

        }


    }
}
/*
14. create a method named printEachElement that can print each element of an integer array
 */