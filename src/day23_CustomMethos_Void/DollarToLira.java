package day23_CustomMethos_Void;

public class DollarToLira {

    public static void main(String[] args) {

        dollarToLira(2500);


    }


    public static void dollarToLira(double dollar){

        double lira = dollar * 14.5;

        System.out.println(dollar + " dollar is " + lira + " lira.");

    }
}
/*
10. create a method that can can convert dollar to lira
 */