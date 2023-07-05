package day39_Recap.task_Animal;

public class Parrot extends FriendlyAnimal{
    public Parrot(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }
    public void fly(){
        System.out.println(getClass().getSimpleName()+" is fling");
    }
    public void sing(){
        System.out.println(getClass().getSimpleName()+ " is singing");
    }
}
/*
	4. Create the following sub classes of FriendlyAnimal and Override the eat method

			4. Parrot:
					Extra methods:
						fly()
						sing()
 */
