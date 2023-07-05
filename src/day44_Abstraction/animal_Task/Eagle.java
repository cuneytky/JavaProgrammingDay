package day44_Abstraction.animal_Task;

public class Eagle extends Animal implements WildAnimal, Flyable{

    public Eagle(String breed, char gender, int age, String size, String color) {
        super("Eagle", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats snake");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunts snake");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly 50km/h");
    }
}
