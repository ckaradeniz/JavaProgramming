package day27_WrapperClasses;

public class IsEqualUpperCasesAndLowerCases {

    public static void main(String[] args) {

        String str = "JAVA java";

        boolean b1 = isEqualChars(str);

        System.out.println(b1);


    }
    public static boolean isEqualChars(String str){

        int upperCases = 0;
        int lowerCases = 0;
        for (char each : str.toCharArray()) {

            if (Character.isUpperCase(each)){
                upperCases++;
            }
            if (Character.isLowerCase(each)){
                lowerCases++;
            }
        }
        boolean isEqual = upperCases == lowerCases;

        return isEqual;
    }



}

/*
Write program that returns true if the total number of upper case characters are equal to total number of Lowercase
characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */
