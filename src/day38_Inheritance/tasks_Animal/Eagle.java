package day38_Inheritance.tasks_Animal;

public class Eagle extends Animal{
    public Eagle(String breed, String color, String size, int age, char gender) {
        super("Eagle", breed, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats snake");
    }
}
