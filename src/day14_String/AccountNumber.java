package day14_String;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String accountNum = input.nextLine();

        boolean firstCondition = accountNum.charAt(0) == '2' && accountNum.length() == 7;
        boolean secondCondition = accountNum.charAt(0) == '5' && accountNum.length() == 10;

        if (firstCondition || secondCondition){
            System.out.println("Number is valid");
        }else {
            System.out.println("Invalid account number");
        }
        input.close();


    }
}
/*
Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */