package day17_While_DoWhile;

import java.util.Arrays;
import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "";
        String gender = "";
        String isMarried = "";
        int age = 0;
        int miles = 0;
        String insuranceType = "";
        String accidentClaim = "";
        String antiTheft = "";
        int startPrice = 0;
        double discountAndChargeRate = 0;
        double insuranceQuote = 0;


        System.out.println("Enter your name:");
        name = scan.nextLine();

        do {
            System.out.println("Enter your gender: (Male/Female)");
            gender = scan.nextLine().toLowerCase();

        }while (!(gender.equals("male") || gender.equals("female")));

        do {
            System.out.println("Are you married? (yes/no)");
            isMarried = scan.nextLine().toLowerCase();

        }while (!(isMarried.equals("yes") || isMarried.equals("no")));

        do {
            System.out.println("Enter your age:");
            age = scan.nextInt();

        }while (!(age >= 0 && age <= 120));

        do {
            System.out.println("How many miles do you drive in a day?");
            miles = scan.nextInt();

        }while (!(miles >= 5));

        scan.nextLine();
        do {
            System.out.println("Which one do you want : full coverage or liability insurance?");
            insuranceType = scan.nextLine().toLowerCase();

        }while (!(insuranceType.equals("full coverage") || insuranceType.equals("liability")));

        do {
            System.out.println("Did you do any accidents or claims in past 5 years? (Yes/No)");
            accidentClaim = scan.nextLine().toLowerCase();

        }while (!(accidentClaim.equals("yes") || accidentClaim.equals("no")));

        do {
            System.out.println("Has your car an anti-theft device (Yes/No)");
            antiTheft = scan.nextLine();

        }while (!(antiTheft.equals("yes") || antiTheft.equals("no")));


        if (insuranceType.equals("liability")) {

            if (age < 25) {
                startPrice += 90;
            } else {
                startPrice += 50;
            }
            if (miles <= 10) {
                startPrice += 10;
            } else if (miles <= 50) {
                startPrice += 30;
            } else {
                startPrice += 50;
            }
        }else {


            if (age < 25) {
                startPrice += 160;
            } else {
                startPrice += 120;
            }
            if (miles <= 10) {
                startPrice += 20;
            } else if (miles <= 50) {
                startPrice += 40;
            } else {
                startPrice += 70;
            }
        }



        if (antiTheft.equals("yes")){
            discountAndChargeRate -= 0.05;
        }
        if (accidentClaim.equals("yes")){
            discountAndChargeRate = 0.15;
        }else{
            discountAndChargeRate -= 0.10;
        }
        if (isMarried.equals("yes")){
            discountAndChargeRate -= 0.05;
        }

        insuranceQuote = startPrice + (startPrice * discountAndChargeRate);


        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Age = " + age);
        System.out.println("Married = " + isMarried);
        System.out.println("Insurance Type = " + insuranceType);
        System.out.println("Accident or Claim = " + accidentClaim);
        System.out.println("Anti Theft Device = " + antiTheft);
        System.out.println("Your insurance quote is = $" + insuranceQuote);




    }
}
/*

    6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
					*/

		/*Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount


 */