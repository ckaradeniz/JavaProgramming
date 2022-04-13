package day38_Inheritence.employeeTask;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public int id;
    public String jobTitle;
    public String salaryName;
    public String companyName;

    public Employee(String name, int age, char gender, int id, String jobTitle, String salaryName, String companyName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salaryName = salaryName;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(name + " is working as a "+ jobTitle);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaryName='" + salaryName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, comapnyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()


	2. Create ethe following subclasses and override the work method in each subclass:

			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot

		if any adidtional field or methods needed, please add them
 */