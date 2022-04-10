package day27_WrapperClasses;

public class RetrieveFromString {

    public static void main(String[] args) {


        String str = "Wooden Spoon!";

        System.out.println(retrieve(str));


    }


    public static String retrieve(String str){

        String result = "";
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (char each : str.toCharArray()) {

            if (Character.isLetter(each)){
                letters += each;
            }
            if (Character.isDigit(each)){
                digits += each;
            }
            if (!Character.isLetterOrDigit(each)){
                specialChars += each;
            }

        }
        result = "letters = " + letters + "\nDigits = "+ digits + "\nspecialChars = "+specialChars;

        return result;
    }



}
/*
Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */
