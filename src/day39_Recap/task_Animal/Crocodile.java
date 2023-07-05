package day39_Recap.task_Animal;

public class Crocodile extends WildAnimal{
    public Crocodile(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println("hunted wild animals");
    }
}
