package day05_Concatenation;

public class PhoneNumber {

    public static void main(String[] args) {

        int countryCode = 31,
            areaCode = 6,
            localNumber = 84714182;

        String phoneNumber = "+" + countryCode + "(" + areaCode + ")-" + localNumber;

        System.out.println(phoneNumber);

    }
}
/*
create a class named Phone Number and declare the following variables:
countryCode, areaCode, localNumber
use string concatenation to display the phone number
ex:
if  countryCode = 1
areaCode = 703
localNumber = 4512625
output:
+1(703)-4512625
 */