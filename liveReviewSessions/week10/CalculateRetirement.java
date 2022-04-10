package week10;

public class CalculateRetirement {

    public static void main(String[] args) {

        // This example was implemented to show that we can call a method from other methods

        yearsUntilRetirement("Oscar", 1977); //Oscar retires in 20 years

        yearsUntilRetirement("Cengiz", 1991);//Cengiz retires in 34 years

    }
    // calculate age of person
    public static int calculateAge(int yearOfBirth){

        return 2022 - yearOfBirth;
    }


    // assume that 65 is retirement age
    public static void yearsUntilRetirement(String name, int yearOfBirth){

        int yearsUntilRetirement = 65 - calculateAge(yearOfBirth);

        System.out.println(name + " retires in " + yearsUntilRetirement + " years");

    }

}
