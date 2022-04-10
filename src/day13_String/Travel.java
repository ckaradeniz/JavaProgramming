package day13_String;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a valid passport? (yes or no) :");
        String passport = input.next().toLowerCase();

        int costOfTicket = 1000;

        if(passport.equals("yes")){

            input.nextLine();
            System.out.println("Enter the country you will travel :");
            String countryName = input.nextLine();

            System.out.println("How many bags do you have?");
            byte numOfBags = input.nextByte();

            System.out.println("How many people you will travel?");
            short numOfPeople = input.nextShort();

            input.nextLine();
            System.out.println("Enter the name of the people you will travel with in one line, separating each name with a comma:");
            String nameOfPeople = input.nextLine();

            int discount = numOfPeople * 100;
            if (numOfPeople > 3){
                discount = 300;
            }
            int costAmount = 1000 + (numOfBags * 50) - discount;

            System.out.println("Your ticket is booked to " + countryName + ". We have charged extra for the " +
                    numOfBags + " bags but you are traveling with " + nameOfPeople +
                    " so we are giving a discount. Your total cost is " + costAmount );



        }else if (passport.equals("no")){

            int costOfRenewal = 200;
            int currentYear = 2022;

            System.out.println("When did your passport expired?");
            int expiredYear = input.nextInt();

            input.nextLine();
            System.out.println("Which country you are planning to travel?");
            String whichCountry = input.nextLine();

            System.out.println("Will you travel next year?(yes-no)");
            String nextYear = input.next().toLowerCase();

            int expired = currentYear - expiredYear;
            int totalCosts = costOfRenewal + (expired * 75);

            if (nextYear.equals("yes")){
               totalCosts += 100;
            }else if (nextYear.equals("no")){
                totalCosts -= 50;
            }



            System.out.println("Looks like your password has been expired for " + expired +
                            " years, but not to worry we will get it ready for you to travel to " + whichCountry +
                    ". Your total cost has come out to " + totalCosts);

            input.close();


        }


    }
}
/*
Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name
            		 with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags but
            		you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready
        			for you to travel to $allCountries. Your total cost has come out to $costAmount."
 */