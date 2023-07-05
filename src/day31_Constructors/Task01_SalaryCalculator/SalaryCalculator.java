package day31_Constructors.Task01_SalaryCalculator;
public class SalaryCalculator {
    public double stateTaxRate, federalTaxRate, hourlyRate, weeklyHours;
    public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }
    public double stateTax(){
        return stateTaxRate*salary();
    }
    public double federalTax(){
        return federalTaxRate*salary();
    }
    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                " Salary= $" + salary() +
                ", stateTax= " + stateTax() +
                ", federalTax= " + federalTax() +
                ", salaryAfterTax= $" + salaryAfterTax() +
                '}';
    }
}
/*
1. SalaryCalculator Task:
	1.1 Create a class named Salary calculator:
		   Attributes:
		   hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
	 Add a constructor to set all the fields
		        Actions:
	salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
	stateTax(): calculates the totalStateTax
	federalTax(): calculates the total federal tax
	salaryAfterTax(): calculates the salary after tax
toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */