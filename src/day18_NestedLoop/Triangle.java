package day18_NestedLoop;

public class Triangle {

    public static void main(String[] args) {

        int star = 1;

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < star; i++) {

                System.out.print("* ");

            }
            System.out.println();
            star++;
        }



        /*
            for (int i = 1; i <= 10; i++) {
            System.out.println("* ".repeat(i));
          }
         */

    }
}
/*
Use a nested loop to print the following shape
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * * * *
 */