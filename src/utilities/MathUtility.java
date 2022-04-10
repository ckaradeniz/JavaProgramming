package utilities;

public class MathUtility {


    //returns the sum of two integers
    public static int sum(int num1, int num2){

        return num1+num2;

    }


    //return the sum of two decimal numbers
    public static double sum(double num1, double num2){

        return num1+num2;

    }


    //returns the subtraction of two integers
    public static int subtraction(int num1, int num2){

       return num1 - num2;

    }

    //returns the subtraction of two decimals
    public static double subtraction(double num1, double num2){

        return num1 - num2;

    }


    //returns the multiplication of two integers
    public static int multiplication(int num1, int num2){

        return num1 * num2;

    }


    //returns the multiplication of two decimals
    public static double multiplication(double num1, double num2){

        return num1 * num2;

    }


    //returns the division result
    public static double division(double num1, double num2){

        return num1 / num2;
    }



    //checks if an integer is even number
    public static boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }

    }


    //checks if an integer is odd number
    public static boolean isOdd(int num){
        if (num % 2 != 0){
        return true;
        }else{
        return false;
        }
    }



    //returns the maximum number between two integers
    public static int max(int num1, int num2){
        return (num1 > num2)? num1 : num2;
    }


    //return the maximum number between two decimal numbers
    public static double max(double num1, double num2){
        return (num1 > num2)? num1 : num2;
    }



    //returns the minimum number between two integers
    public static int min(int num1, int num2){
        return (num1 < num2)? num1 : num2;
    }


    //return the minimum number between two decimal numbers
    public static double min(double num1, double num2) {
        return (num1 < num2) ? num1 : num2;
    }



    //returns the square of an integer
    public static int square(int num){
        return num * num;
    }


    //returns the square of a double
    public static double square(double num){
        return num * num;
    }


    //returns the cube of an integer
    public static int cube(int num){
        return num * num * num;
    }

    //returns the cube of a double
    public static double cube(double num){
    return num * num * num;
    }


    
}