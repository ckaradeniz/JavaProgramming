package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        /*
        variable naming rules:
		1. MUST be unique
		2. camelCase
		3. Can Not start with digits
		4. starts with lower case letters
		5. Can Not be Java Reserved words
		6. Can Not have special characters other than _ and $
		7. readable, understandable
         */


        //age : 38 years old

        byte age = 38;

        // weight : 160 pounds

        //byte weight = 160; // 160 is out of byte's range

        short weight = 160; // 160 is within the range of short

        int salary = 100_000; // prefer this type

        long asset = 3_333_333_333L;

        // tax : 0.26

        float tax = 0.26F;

        double PI = 3.14; // prefer this type

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35; // 35 is ascii table number of #
        System.out.println("ch2 = " + ch2);

        char ch3 = 65535;
        System.out.println("ch3 = " + ch3);

        char ch4 = 11858;
        System.out.println("ch4 = " + ch4);

        char gender = 'M';

        char yesNo = 'Y';

        char ch5 = 111;
        System.out.println("ch5 = " + ch5);

        boolean isEmployed = true;

        boolean isMarried = false;

        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployed = " + isEmployed);

        boolean result = 100 > 300;
        System.out.println("result = " + result);

        String name = "Cengiz";
        String city = "Noordwijk";
        String country = "The Netherlands";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("country = " + country);

        String first_name$ = "Cengiz"; // we can use only _ and $ while creating variable name, the other special characters cannot be used.

        int num35 = 123; // digits cannot be at the beginning of the variable name









    }
}
