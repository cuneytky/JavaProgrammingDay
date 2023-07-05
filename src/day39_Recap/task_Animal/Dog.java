package day39_Recap.task_Animal;

public class Dog extends FriendlyAnimal{
    public Dog(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }
    public void bark(){
        System.out.println(getClass().getSimpleName()+" named "+ getName()+" is barking");
    }

}
/*
	4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

 */