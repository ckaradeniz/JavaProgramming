package day33_Statics.PracticeTasks;

public class CydeoStudent {

    public String name;
    public int age, ID, groupNumber, batchNumber;
    public char gender, grade;

    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, char gender, int ID,char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.age = age;
        this.ID = ID;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }


    public void Study(){
        System.out.println(name + " is studying");

    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public void printSchoolName(){
        System.out.println(schoolName);
    }

    public void printProgrammingLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", groupNumber=" + groupNumber +
                ", batchNumber=" + batchNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
