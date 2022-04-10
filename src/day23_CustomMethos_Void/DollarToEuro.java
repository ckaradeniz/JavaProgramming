package day23_CustomMethos_Void;

public class DollarToEuro {

    public static void main(String[] args) {


        dollarToEuro(2500);


    }

    public static void dollarToEuro(double dollar){

        double euro = dollar * 0.90;

        System.out.println(dollar + " dollar is " + euro + " euro.");

    }

}
/*
9. create a method that can convert dollar to euro
 */