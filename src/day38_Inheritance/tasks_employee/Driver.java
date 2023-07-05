package day38_Inheritance.tasks_employee;

public class Driver extends Employee{
    public Driver(String name, String ID,  int age, char gender) {
        super(name, ID, "Driver", age, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working as a "+getJobTitle());
    }
}
