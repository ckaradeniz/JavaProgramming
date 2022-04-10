package day06_PrimitiveTypeCastings;
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */
public class BirthDay {

    public static void main(String[] args) {

        String name = "Cengiz",
                birthMonth = "June";
        int birthDay = 28,
                birthYear = 1991;

        String fullBirthDay = name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + ".";

        System.out.println(fullBirthDay);

        System.out.println("--------------------------------------------------");

//        My favorite book is "bookName"

        String bookName = "1984";

        System.out.println("My favorite book is \"" + bookName + "\"");

    }
}
