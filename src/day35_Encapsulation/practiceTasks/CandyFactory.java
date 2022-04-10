package day35_Encapsulation.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {


        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(
                new Candy("Tonys", 20, 2.5, true),
                new Candy("Ulker", 30,1.6, false),
                new Candy("Eti", 10, 1.2,false),
                new Candy("Sultani", 25, 2.2, false),
                new Candy("Tablerone", 40, 4.0, true)
        ));


        for (Candy candy : candies) {

            System.out.println(candy.getBrand() + " : " + candy.getPrice());

        }


    }
}
/*
1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */