package day36_Inheritance.Task_Employee;

public class Developer extends Employee{
    public void coding(){
        System.out.println(getClass().getSimpleName()+" is coding");
    }
    public void fixingBugs(){
        System.out.println("Fixing Bugs: "+name);
    }
}
/*
	2.3 Create the sub class of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()
 */