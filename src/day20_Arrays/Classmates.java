package day20_Arrays;

public class Classmates {

    public static void main(String[] args) {

        String[] classMates = {"Ali Tas", "Hasan Bas", "Huseyin Yas", "Veli Kas", "Ahmet Tek", "Mehmet Yek", "Recep Bek",
        "Tarik Sek", "Kadir Lek", "Haydar Kek"};

        for (int i = 0; i < classMates.length; i++) {

            String initials = classMates[i].charAt(0) + "." + classMates[i].charAt(classMates[i].indexOf(" ") + 1 ) + ".";

            System.out.println(initials);

        }


    }
}
/*
create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
 */