package day36_Inheritance.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Cengiz", 'M', 31,1234, "SDET",40000);

        tester.work();
        tester.creatingTicket();
        tester.testing();

        System.out.println(tester);


        Developer developer = new Developer();
        developer.setInfo("Muharrem", 'M',31,1235,"DEV-OPS Engineer", 80000);

        developer.fixingBugs();
        developer.coding();

        System.out.println(developer);


        Teacher teacher = new Teacher();
        teacher.setInfo("Asiya", 'F', 30, 1236, "Teacher", 60000);

        teacher.teaching();

        System.out.println(teacher);

        Driver driver = new Driver();
        driver.setInfo("Seyfo", 'M', 31, 1237,"Driver", 50000);

        driver.driving();

        System.out.println(driver);


    }
}
/*
2.7 Create a class named Employee Objects and and test of the sub class' objects
 */