package day39_Recap.task_Animal;

public class WildAnimal extends Animal{
    private boolean isWild, isFriendly, isPlayable;

    public WildAnimal(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void hunt(){
        System.out.println(getName()+" is hunting.");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                " name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", age= " + getAge() +
                ", gender= " + getGender() +
                " isWild= " + isWild +
                ", isFriendly= " + isFriendly +
                ", isPlayable= " + isPlayable +
                '}';
    }
}
/*
	3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */