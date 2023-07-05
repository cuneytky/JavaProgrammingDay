package day44_Abstraction.animal_Task;

public final class Parrot extends Animal implements Playable, Flyable{
    public Parrot( String breed, char gender, int age, String size, String color) {
        super("Parrot", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats chocolate");
    }

    @Override
    public void play() {

    }


    @Override
    public void fly() {
        System.out.println(getName()+" can fly 20km/h");
    }
}
