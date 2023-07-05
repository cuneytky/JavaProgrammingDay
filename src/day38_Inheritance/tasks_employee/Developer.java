package day38_Inheritance.tasks_employee;

public class Developer extends Employee{
    public Developer(String name, String ID, int age, char gender) {
        super(name, ID, "Developer", age, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working as a "+getJobTitle());
    }
}
