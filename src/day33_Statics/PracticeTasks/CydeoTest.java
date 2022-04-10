package day33_Statics.PracticeTasks;

import java.util.Arrays;

public class CydeoTest {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("Cengiz",31,'M', 123,'A', 8,21);

        System.out.println(cydeoStudent1);

        cydeoStudent1.printSchoolName();

        cydeoStudent1.printProgrammingLanguage();

        cydeoStudent1.attendClass();

        cydeoStudent1.Study();


    }
}
