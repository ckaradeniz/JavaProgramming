package day31_Constructors.scrumTask;

public class Tester {

    public String name, jobTitle;
    public int employeeID;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void smokeTesting(){
        System.out.println(name + " is creating smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }

    public void dailyStandUp(){
        System.out.println(name + " is attending daily stand up meeting");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary= $" + salary +
                '}';
    }
}
/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */