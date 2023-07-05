package day39_Recap;



public class Animal {
    private String name, breed, color,size;
    private int age;
    private char gender;

    public Animal(String name, String breed, String color, String size, int age, char gender) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setSize(size);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("name can not be null");
            System.exit(1);
        }
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed==null){
            System.err.println("breed can not be null");
            System.exit(1);
        }
        if(breed.isEmpty() || breed.isBlank()){
            System.err.println("Invalid breed");
            System.exit(1);
        }
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null){
            System.err.println("color can not be null");
            System.exit(1);
        }
        if(color.isEmpty() || color.isBlank()){
            System.err.println("Invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age can not negative");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( !(gender=='M'|| gender=='F')){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }
    public void eat(){
        System.out.println("eating");
    }
    public void drink(){
        System.out.println("drinking");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void move(){
        System.out.println("moving");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age= " + age +
                ", gender= " + gender +
                '}';
    }
}

class FriendlyAnimal extends Animal {

    private boolean isWild, isFriendly, isPlayable;

    public FriendlyAnimal(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
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
    public void play(){
        System.out.println("playing");
    }
    public void pet(){
        System.out.println(getName()+" is pat.");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", age= " + getAge() +
                ", gender= " + getGender() +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}

class WildAnimal extends Animal {
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
class Cat extends FriendlyAnimal {
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

class Bear extends WildAnimal {
    public Bear(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is eating fish and honey");
    }
}

class Dolphin extends FriendlyAnimal {
    public Dolphin(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }
    public void swim(){
        System.out.println(getClass().getSimpleName()+" is swimming.");
    }

}

class Dog extends FriendlyAnimal {
    public Dog(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }
    public void bark(){
        System.out.println(getClass().getSimpleName()+" named "+ getName()+" is barking");
    }

}

class Crocodile extends WildAnimal{
    public Crocodile(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println("hunted wild animals");
    }
}
class Lion extends WildAnimal{
    public Lion(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(" Lion is hunter...");
    }
}

 class Eagle extends WildAnimal{
public Eagle(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
        }

@Override
public void hunt() {
        System.out.println(getName()+" is hunting.");
        }
public void fly(){
        System.out.println(getName()+ " and fling");
        }
        }

class Tiger extends WildAnimal{
    public Tiger(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting and it eat meat.");
    }
}

class Python extends WildAnimal{
    public Python(String name, String breed, String color, String size, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, age, gender, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting mouse");
    }
}
class Parrot extends FriendlyAnimal {
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

class AnimalTest {
    public static void main(String[] args) {

        day39_Recap.task_Animal.FriendlyAnimal friendlyAnimal =new day39_Recap.task_Animal.FriendlyAnimal("cat","yes","red","small",2,'M',false,true,true);

        friendlyAnimal.isFriendly();
        friendlyAnimal.play();
        System.out.println(friendlyAnimal);

        day39_Recap.task_Animal.Dog dog= new day39_Recap.task_Animal.Dog("poncik", "breed","red","small",1,'F',false,true,true);
        dog.bark();
        System.out.println(dog);

        day39_Recap.task_Animal.Crocodile crocodile=new day39_Recap.task_Animal.Crocodile("hunter","egg", "green","large",5,'F',true,false,false);
        crocodile.hunt();
        crocodile.drink();
        System.out.println(crocodile.getSize());
        System.out.println(crocodile);


    }
}

/*
Animal Task:
	1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color
			Encapsulate all the fields
			Add a constructor to set all the fields
					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative
			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()


	2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()

	3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()


	4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()


	5. Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile


	6. Create a class named Zoo:
			Create the objects of each sub classes and
			test all the functions of each objects
            Analyze the relationships between the classes


 */

