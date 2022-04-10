package day30_CustomClass;

import day30_CustomClass.Employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CapitalOne {

    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        employee1.setInfo("Cengiz", 5039, 'M', "SDET", 45000, true);
        
        Employee employee2 = new Employee();
        employee2.setInfo("Muharrem", 5043, 'M', "Senior Developer", 100000, true);

        Employee employee3 = new Employee();
        employee3.setInfo("Galip", 5055, 'M', "Junior Developer", 40000, true);

        Employee employee4 = new Employee();
        employee4.setInfo("Baris", 5066, 'M', "SalesForce Developer", 25000, false);

        Employee employee5 = new Employee();
        employee5.setInfo("Seyfo", 5089, 'M', "Marketing", 50000, true);
        
        
        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        System.out.println(Arrays.asList(employees));


        
        int countFullTime = 0;
        int countPartTime = 0;
        for (Employee employee : employees) {
            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
        }
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);

        double maxSalary = employees[0].salary;
        double minSalary = employees[0].salary;
        for (Employee employee : employees) {
            if (employee.salary > maxSalary){
                maxSalary = employee.salary;
            }
            if (employee.salary < minSalary){
                minSalary = employee.salary;
            }
            
        }
        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);
        
    }
}
/*
CapitalOne Class:

	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */