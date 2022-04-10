package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, >=, <, <=

        boolean result1 = 20 > 40; //false
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 300;// true
        System.out.println("result2 = " + result2);

        System.out.println("-----------------------------------------");

        // credit score of 720
        int creditScore = 745;
        
        boolean isElligibleForLoan = creditScore >= 720;
        System.out.println("isElligibleForLoan = " + isElligibleForLoan); // true

        System.out.println("-----------------------------------------");
        
        int score = 59;
        boolean hasFailed = score < 60;
        System.out.println("hasFailed = " + hasFailed);// true

        System.out.println("-----------------------------------------");

        int x = 100;
        int y = 200;
        
        boolean isEqual = x == y;
        System.out.println("isEqual = " + isEqual);//false

        boolean result8 = "MUHTAR" == "GOOD GUY";
        System.out.println("result8 = " + result8);//false

        boolean result9 = 'A' == 'a';
        System.out.println("result9 = " + result9);//false

        boolean result10 = "Java" == "  Java  ";
        System.out.println("result10 = " + result10);//false

        System.out.println("-----------------------------------------");
        
        boolean result11 = 100 != 234;
        System.out.println("result11 = " + result11);//true

        boolean result12 = "Java" != "Break";
        System.out.println("result12 = " + result12);//true
        
        boolean result13 = 300 != 300;
        System.out.println("result13 = " + result13);//false







    }
}
