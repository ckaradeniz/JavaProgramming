package day23_CustomMethos_Void;

public class GradeOfStudents {


    public static void main(String[] args) {


        gradeOfTheStudents(140);


    }

    public static void gradeOfTheStudents(int score){

        if (score >= 0 && score <= 100){

            String grade = (score >= 80) ? "A" :(score>= 70)? "B" :(score>=50)? "C" : "F";

            System.out.println(grade);

        }else {
            System.out.println("Invalid Entry");
        }

    }

}
/*

	5. create a method that can calculate the grade of the student based on the score
 */