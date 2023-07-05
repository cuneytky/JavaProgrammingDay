package day44_Abstraction.animal_Task;

public final class Cat extends Animal implements Playable{

    public Cat( String breed, char gender, int age, String size, String color) {
        super("Cat", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats Biryani");
    }

    public void meow (){
        System.out.println(getName()+" is meowing.");
    }


    @Override
    public void play() {

    }
}
