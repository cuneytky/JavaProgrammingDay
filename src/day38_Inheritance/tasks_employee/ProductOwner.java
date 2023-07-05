package day38_Inheritance.tasks_employee;

public class ProductOwner extends Employee{
    public ProductOwner(String name, String ID,  int age, char gender) {
        super(name, ID, "Product Owner", age, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working as a "+getJobTitle());
    }
}
