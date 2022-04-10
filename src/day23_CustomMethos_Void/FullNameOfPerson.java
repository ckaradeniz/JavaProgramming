package day23_CustomMethos_Void;

public class FullNameOfPerson {

    public static void main(String[] args) {

        fullName("cengiz", "KARADEniz");

    }




    public static void fullName(String firstName, String lastName){

      String fullName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase() + " "
              + lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();

        System.out.println(fullName);



    }

}
/*

	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */