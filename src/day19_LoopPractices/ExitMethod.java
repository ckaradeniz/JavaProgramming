package day19_LoopPractices;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i == 3) {

                //break; // 0,1,2,Wooden Spoon
                //continue; // 0,1,2,4,Wooden Spoon
                System.exit(0); // 0,1,2
            }

            System.out.println(i);
        }
        System.out.println("Wooden Spoon");




    }
}
