package day10_NestedIf;

public class Grade {

    public static void main(String[] args) {

        char grade = 'F';
        String result = "";

        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){

            result = (grade == 'A')? "excellent" :(grade == 'B')? "great job" :(grade == 'C')? "good"
                    :(grade == 'D')? "passed" : "failed";


        }else {
            result = "Invalid";
        }
        System.out.println(result);


    }
}
/*
Create a class called Grade, a char variable named grade is given.
write a program to print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */