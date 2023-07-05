package day37_Inheritance.animalTask;

public class Parrot extends Animal {
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    // public String parrotWingColor;  ekstra özellik ekleyebilirz.
    // ama costructors ıcıne de eklemeyı uutma
    // this. ile de cağırmayı unutma


    public void sing(){
        System.out.println(name+" is singing");
    }


}