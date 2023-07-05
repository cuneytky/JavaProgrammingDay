package day36_Inheritance.Task_Employee;

public class Tester extends Employee {

    public void testing(){
        System.out.println(getClass().getSimpleName()+" is testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating");
    }

}
/*
2.2 Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()
 */