package day19_LoopPractices;
import java.util.Scanner;
public class Tasks05_SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("How much you make an hour?");
            int hour = scanner.nextInt();
            if (hour <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            int weekhour = scanner.nextInt();
            if (weekhour < 1 || weekhour > 144) {
                System.err.println("Invalid Entry for weekly hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double taxRate = scanner.nextDouble();
            if (taxRate < 0 || taxRate > 10) {
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            double grossSalary = hour*weekhour*52;
            double federalTax = grossSalary*0.26;
            double stateTax = (taxRate/100)*grossSalary;
            double totalTax = federalTax+stateTax;
            double netIncome = grossSalary - totalTax;
            System.out.println("1.Gross Salary = " + grossSalary);
            System.out.println("2.Federal Tax  = " + federalTax);
            System.out.println("3.State Tax    = " + stateTax);
            System.out.println("4.Total Tax    = " + totalTax);
            System.out.println("5.Net Income   = " + netIncome);
            System.out.println("Would you like to continue?");
            String yesNo = scanner.next();
            if (!(yesNo.equals("yes") || yesNo.equals("no"))) {
                System.err.println("invalid entry");
                System.exit(0);
            }
            if (yesNo.equals("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }
    }
}
/*
5. Write a program for the salary calculator
	1. Ask the user "How much you make an hour?"
			If user entered hourlyRate is 0 or negative, terminate the program
			after displaying the error message "Invalid Entry for Hourly Rate"
	2. Ask the user  "How many hours do you work per week?"
			if user entered weeklyHour is less than 1 or greater than 144, terminate
			the program after displaying the error message "Invalid Entry for Weekly Hours"
	3. Ask the user  "Enter your state tax rate"
		 if the state tax rate is less than 0% or greater than 10%, terminate the
		 program after displaying the error message "Invalid Entry for state tax Rate"
	4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income
	5. Ask the user "Would you like to continue?"
			If "yes" --> repeat all the previous steps
			If "no" --> print "Thank you for using Cydeo Salary Calculator APP"
	If user enters an invalid entry, terminate the program after displaying
			the error message "Invalid Entry"
 */