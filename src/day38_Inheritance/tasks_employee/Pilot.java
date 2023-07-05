package day38_Inheritance.tasks_employee;

public class Pilot extends Employee{
    public Pilot(String name, String ID, int age, char gender) {
        super(name, ID, "Pilot", age, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working as a "+getJobTitle());
    }
}
