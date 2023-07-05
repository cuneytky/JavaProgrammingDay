package day38_Inheritance.tasks_employee;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, String ID,  int age, char gender) {
        super(name, ID, "Business Analyst", age, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working as a "+getJobTitle());
    }
}
