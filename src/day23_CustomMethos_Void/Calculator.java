package day23_CustomMethos_Void;

public class Calculator {


    public static void main(String[] args) {

        calculator(5,7, '+');


    }


    public static void calculator(int num1, int num2, char mathOperator){

        if (mathOperator == '+' || mathOperator== '-' || mathOperator =='*' || mathOperator== '/'){

            switch (mathOperator){
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
            }
        }else {
            System.out.println("Invalid");
        }



    }
}
/*

	15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
 */