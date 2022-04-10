package day13_String;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String splitOrNot = input.next().toLowerCase();

        int numOfPeople = 1;

        if (splitOrNot.equals("yes")){
            System.out.println("Enter the number of people:");
            numOfPeople = input.nextInt();
        }

        System.out.println("Enter the check amount:");
        double checkAmount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.next().toLowerCase();

        input.close();


        double totalTip;

        if (serviceQuality.equals("excellent")){
            totalTip = checkAmount * 25/100;
        }else if (serviceQuality.equals("great")){
            totalTip = checkAmount * 20/100;
        }else if (serviceQuality.equals("good")){
            totalTip = checkAmount * 15/100;
        }else if (serviceQuality.equals("fair")){
            totalTip = checkAmount * 10/100;
        }else if (serviceQuality.equals("poor")){
            totalTip = checkAmount * 5/100;
        }else {
            totalTip = checkAmount * 0;
        }
        double totalPay = checkAmount + totalTip;
        double totalPerPerson = totalPay / numOfPeople;
        double tipPerPerson = totalTip / numOfPeople;

        String result = "Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip +
                "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson;

        System.out.println(result);


    }
}
/*
Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output)
	Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */