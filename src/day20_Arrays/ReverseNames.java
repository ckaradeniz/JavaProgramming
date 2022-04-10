package day20_Arrays;

public class ReverseNames {

    public static void main(String[] args) {

        String[] classMates = {"Ali Tas", "Hasan Bas", "Huseyin Yas", "Veli Kas", "Ahmet Tek", "Mehmet Yek", "Recep Bek",
                "Tarik Sek", "Kadir Lek", "Haydar Kek"};



        for (int i = 0; i < classMates.length; i++) {

            String reversed ="";

            for (int j = classMates[i].length()-1; j >= 0; j--) {

                reversed += classMates[i].charAt(j);


            }

            System.out.println(reversed);


        }




    }
}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */