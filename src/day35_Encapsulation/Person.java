package day35_Encapsulation;
public class Person {
    public String name, language;     // instance variable
    public int age;
    public char gender;

    public static String planet;      // static variable
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    // constructor block
    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    static { // static block
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;
    }

    public static void printPlanetName(){   //static method
        System.out.println("Planet name is "+planet);
    }
    public  void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public  void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ",  planet=" +  planet +
                '}';
    }
}
/*

warmup tasks:
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize all the fields
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */