package day36_Inheritance.Task_Employee;

public class Driver extends Employee {
    public void drivering(){
        System.out.println(getClass().getSimpleName()+" is driving.");
        System.out.println("Driving name : "+name);
    }
}
/*
	2.6 Create the sub class of Employee named Driver:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				drivering()
				toString()
 */