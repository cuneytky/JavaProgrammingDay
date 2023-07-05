package day38_Inheritance.tasks_Animal;

public class Tiger extends Animal{

    public Tiger( String breed, String color, String size, int age, char gender) {
        super("Tiger", breed, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats deer");
    }
}
