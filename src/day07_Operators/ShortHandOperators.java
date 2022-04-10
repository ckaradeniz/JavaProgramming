package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {


        //assignment : =
        
        int number = 100;
        System.out.println("number = " + number);//100

        number = 200;
        System.out.println("number = " + number);//200

        String word = "Java Programming";
        System.out.println("word = " + word);//Java Programming

        word = "Wooden Spoon";
        System.out.println("word = " + word);//Wooden Spoon
        
        word = "Cydeo";
        System.out.println("word = " + word);

        int x= 100;
        x+= 200; // k = k + 200;

        System.out.println("x = " + x); //300

        String str = "Wooden";
        str += "Spoon";
        System.out.println("str = " + str); //str = WoodenSpoon


        double availableBalance = 1000.5;
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance); //1300.5


        System.out.println("---------------------------------------------");

        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance); // 800.5

        // withdrawing 200$ , depositing 400$

        availableBalance -= 200; //600.5
        availableBalance += 400; //1000.5

        System.out.println("availableBalance = " + availableBalance);


        System.out.println("---------------------------------------------");

        double salary = 50000.5;
        salary *= 2;

        System.out.println("salary = " + salary);

        System.out.println("---------------------------------------------");

        double num2 = 25000.0;
        num2 /= 2;

        System.out.println("num2 = " + num2);

        System.out.println("---------------------------------------------");

        double num3 = 100;
        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("---------------------------------------------");

        int amount = 127;

        int quarters = amount / 25;
        int cent = amount % 25;

        System.out.println("quarters = " + quarters);//5
        System.out.println("cent = " + cent);//2

        System.out.println("--------------------------------------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y); // y=12





    }
}
