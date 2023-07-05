package day38_Inheritance.tasks_employee;

public class Tester extends Employee{

    public Tester(String name, String ID,  int age, char gender) {
        super(name, ID, "Tester", age, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working as a "+getJobTitle());
    }
}
