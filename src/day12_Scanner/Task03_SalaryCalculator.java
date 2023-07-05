package day12_Scanner;
import java.util.Scanner;
public class Task03_SalaryCalculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter hourlyRate:");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours works in a week?");
        double hourWorkWeek =input.nextDouble();

        System.out.println("enter state tax (in percentage)");
        double stateTax = input.nextDouble();

        System.out.println("enter federal tax (in percentage)");
        double federalTax = input.nextDouble();
        double salary = hourlyRate*hourWorkWeek*52;
        double totalTax= stateTax+federalTax;
        double netIncome = salary-(salary*totalTax/100);
        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);
    }
}
/*
Task:
    3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */