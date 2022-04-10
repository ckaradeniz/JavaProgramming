package day21_ForEachLoop;

public class Palindromes {

    public static void main(String[] args) {

       String[] palindromes = {"anna", "level", "Java", "mom"};



       int count = 0;

        for (String each : palindromes) {


            String reversed = "";


            for (int i = each.length()-1; i >= 0; i--){

                reversed += each.charAt(i);

                if (each.equals(reversed)){

                    count++;
                }

            }


        }
        System.out.println(count);


    }
}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */