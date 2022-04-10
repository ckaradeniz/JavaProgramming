package day23_CustomMethos_Void;

public class GivenInteger {

    public static void main(String[] args) {

        givenInteger(5);


    }

    public static void givenInteger(int integer){

        if (integer>0){
            System.out.println("Positive");
        }else if(integer<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

    }


}
/*
12. create a method that can if the given integer is positive, negative or zero

 */