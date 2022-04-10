package day09_IfStatements;

public class FieldTrip {

    public static void main(String[] args) {

        int gradeNumber = 4;
        String trip;

        if (gradeNumber == 1){
            trip = "location -  Apple orchard\nnumber of groups - 3\nteacher in charge - Ms. Smith";

        }else if (gradeNumber == 2){
            trip = "location - Zoo\nnumber of groups - 7\nteacher in charge - Mr. Lee";

        }else if (gradeNumber == 3){
            trip = "location - Aquarium\nnumber of groups - 5\nteacher in charge - Ms. Wilson";

        }else if(gradeNumber == 4){
            trip = "location - Movie theater\nnumber of groups - 2\nteacher in charge - Ms. Reyes";

        }else if(gradeNumber == 5){
            trip = "location - Museum\nnumber of groups - 5\nteacher in charge - Ms. Lela";

        }else if(gradeNumber == 6){
            trip = "location - Six Flags\nnumber of groups - 8\nteacher in charge - Mr. Watt";
        }else {
            trip = "Invalid Number";
        }
        System.out.println(trip);


    }

}
/*
Create a class called FieldTrip. Your school goes on a Field trip each year.
The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out
the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt

 */