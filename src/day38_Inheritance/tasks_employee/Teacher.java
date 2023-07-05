package day38_Inheritance.tasks_employee;

public class Teacher extends Employee{
    public Teacher(String name, String ID,  int age, char gender) {
        super(name, ID, "Teacher", age, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working as a "+getJobTitle());
    }
}
