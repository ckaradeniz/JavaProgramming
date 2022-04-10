package day24_CustomMethods_Return;

public class WarmupTasks {

    public static void main(String[] args) {

        initials("Cengiz","Karadeniz");

        System.out.println("----------------------------------");

        domainEmail("cengizkaradeniz@yandex.com");

        System.out.println("----------------------------------------------------");


        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domainEmail(email);
        }

        System.out.println("-----------------------------");


        nameOfMonth(6);

    }
    //Create a method that can display the initials of the person
    public static void initials(String first, String last){

        String initials = first.charAt(0) + "."+ last.charAt(0);
        initials = initials.toUpperCase();
        System.out.println(initials);

    }


    //Create a method that can display the domain of the email
     public static void domainEmail(String email){

         System.out.println(email.substring(email.indexOf('@') + 1, email.lastIndexOf('.')));

     }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){  // 95

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){


    }

    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){


    }
    // ageGroups(int age)



}
/*
Warmup tasks:
1. Create a method that can display the initials of the person
2. Create a method that can display the domain of the email
3. Create a method that can display the name of the month based on
the given number to the method
4. Create a method that can print the name of the day based on the
given number to the method
5. Create a method that can print how many days a month has
  6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

 */