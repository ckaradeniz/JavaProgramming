package day12_Scanner;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String result = "";

        System.out.println("How many people you are living with:");
        int people = input.nextInt();

        if (people < 3){
            result = "Live with less than 3 people";

        }else if (people <6){
            result = "Live with 3 - 6 people";
        }else{
            result = "Live with more than 6 people";
        }
        System.out.println(result);

        input.close();



    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */