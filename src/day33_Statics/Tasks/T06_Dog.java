package day33_Statics.Tasks;

public class T06_Dog {

    public String breed, color;
    public int size,age;
    public char gender;
    public static int numberOfLegs=4;
    public static int numberOfEyes=2;
    public static int numberOfWings=0;
    public static boolean isFriendly=true;

    public T06_Dog(String breed, String color, int size, int age, char gender) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println("Dog eats "+breed);
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
    public void play(){
        System.out.println("Dog likes play.");
    }

    public String toString() {
        return "T06_Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()

 */
