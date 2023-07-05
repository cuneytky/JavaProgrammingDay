package day44_Abstraction.animal_Task;

public final class Tiger extends Animal implements WildAnimal{


    public Tiger(String breed, char gender, int age, String size, String color) {
        super("Tiger", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunt deer");
    }
}
