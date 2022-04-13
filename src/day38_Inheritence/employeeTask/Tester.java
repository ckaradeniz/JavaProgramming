package day38_Inheritence.employeeTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int id, String jobTitle, String salaryName, String companyName) {
        super(name, age, gender, id, jobTitle, salaryName, companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " is working on test cases");
    }
}
