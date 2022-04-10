package day31_Constructors.scrumTask;

public class Developer {

    public String name, jobTitle;
    public int employeeID;
    double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name + " is coding");
    }
    public void unitTesting(){
        System.out.println(name + " is unit testing");
    }
    public void fixingBug(){
        System.out.println(name + " is fixing bug");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary= $" + salary +
                '}';
    }
}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */