package day33_Statics.Tasks;

public class T03_Person {

    public String name;
    public int age;
    public char gender;
    public static boolean isHuman;
    public static boolean hasNose;
    public static boolean hasWings;
    public static int numberOfHead;
    public static int numberOfEyes;

    public T03_Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String eat(){
        return name+" eats pizza";
    }
    public String drink(){
        return name+" drinks cola";
    }
    public void sleep(){
        System.out.println(name+" sleep at home.");
    }

    public String toString() {
        return "T03_Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
	instance: name, age, gender
	static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,
	Add a constructor that can set All the fields (instances)
				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */
