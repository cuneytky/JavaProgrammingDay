package day39_Recap.task_Animal;

public class Dolphin extends FriendlyAnimal{
    public Dolphin(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }
    public void swim(){
        System.out.println(getClass().getSimpleName()+" is swimming.");
    }

}
/*
	4. Create the following sub classes of FriendlyAnimal and Override the eat method

			3. Dolphin:
					Extra methods:
						swim()
 */
