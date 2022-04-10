package day09_IfStatements;

public class OxygenTank {

    public static void main(String[] args) {

        int number = 46;
        String oxygenLevel;

        if ( number <= 100 && number > 90){
            oxygenLevel = "Your tank is full";

        }else if (number <= 90 && number > 80){
            oxygenLevel = "Still okay";

        }else if (number <= 80 && number > 70){
            oxygenLevel = "Don't go too far";

        }else if (number <= 70 && number > 60){
            oxygenLevel = "Start to head back";

        }else if (number <= 60 && number >50){
            oxygenLevel = "Be careful now you at 50%";

        }else {
            oxygenLevel = "Dangerous!!!";
        }

        System.out.println(oxygenLevel);

    }
}
/*
Create a class called OxygenTank. You are diving in the ocean. Your
oxygen tank has a certain level (number) and you must print a message
based on the level:
Above 90 -  Your tank is full
Above 80 -  Still okay
Above 70 -  Don't go too far
Above 60 -  Start to head back
Above 50 -  Be careful now you at at 50%
USE ONE PRINT STATEMENT ONLY
 */