package day38_Inheritance.tasks_employee;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, String ID,  int age, char gender) {
        super(name, ID, "Scrum Master", age, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working as a "+getJobTitle());
    }
}
