package day20_Arrays;

public class AverageNumbers {

    public static void main(String[] args) {
        
        int[] numbers = {10,15,20,35,57,78,98,};
        
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            
            sum += numbers[i];
            
        }
        
        double average = sum / numbers.length;

        System.out.println("average = " + average);





    }
}
/*
4. AverageNumber:
        1. Ask the user how many numbers they want to
        enter
        2. get all the inputs from the user and store
        them into an array
        3. Iterate the array & return the average
        number
 */