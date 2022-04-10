package day31_Constructors.PracticeTasks;

public class SalaryCalculator {

    
    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHour;

    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHour = weeklyHour;
    }
    
    public double salary(){
        return hourlyRate * weeklyHour * 52;
    }

    public double stateTax(){
        return salary() * stateTaxRate;
    }

    public double federalTax(){
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHour=" + weeklyHour +
                ", Salary= $" + salary() +
                ", StateTax= $" + stateTax() +
                ", FederalTax= $" + federalTax() +
                ", SalaryAfterTax= $" + salaryAfterTax() +
                '}';
    }
}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHour

	            Add a constructor to set all the fields

		        Actions:        
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax 
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */