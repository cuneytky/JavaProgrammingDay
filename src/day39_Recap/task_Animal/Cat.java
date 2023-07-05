package day39_Recap.task_Animal;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }

    public void scratch(){
        System.out.println(getClass().getSimpleName()+" named "+ getName()+" is scratching.");
    }
    public void meow(){
        System.out.println(getName()+ " is meowing.");
    }

}
/*
2. Cat:
					Extra methods:
						scratch()
						meow()
 */