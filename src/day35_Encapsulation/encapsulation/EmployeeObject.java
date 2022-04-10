package day35_Encapsulation.encapsulation;

public class EmployeeObject {


    public static void main(String[] args) {


        Employee employee1 = new Employee("Tatiana", 'F', 28, 110000);
        System.out.println(employee1);//Employee{name='Tatiana', gender=F, age=28, salary=110000.0}



        Employee employee2 = new Employee("", 'Q', -23, -110000);
        System.out.println(employee2);//Employee{name='null', gender= , age=0, salary=0.0}


        Employee employee3 = new Employee("Tahir", 'M', 30, 120000);
        employee3.setAge(35);
        System.out.println(employee3);//Employee{name='Tahir', gender=M, age=35, salary=120000.0}


        Employee employee4 = new Employee("Aygun", 'F', 31, 115000);
        employee4.setName("Elvira");
        employee4.setSalary(employee4.getSalary() + 15000);

        System.out.println(employee4);//Employee{name='Elvira', gender=F, age=31, salary=130000.0}





    }
}
