package day21_ForEachLoop;

public class EvenAndOdd {


    public static void main(String[] args) {

        int[] nums = {3,4,6,2,8,4,9,1,135,664,87357};

        int countEven = 0;
        int countOdd = 0;

        for (int each : nums) {

            if(each%2 == 0){
                countEven++;
            }else {
                countOdd++;
            }

        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);




    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */