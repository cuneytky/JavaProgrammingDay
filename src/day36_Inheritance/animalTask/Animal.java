package day36_Inheritance.animalTask;
public class Animal { // parent class burası once bu yapılır sonra chıld yap.
    public String name, breed;
    public char gender;
    public int age;
    public String size;
    public String color;
    // constructors cagır (Animal geldi)
    // ve bas tarafı degıstır.(" void setInfo")
    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;  // buradaki name  ile STring name  deki name aynı olmalı
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }
    // sonra ortak ozellikleri girdik eat,drink....
    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void  move(){
        System.out.println(name+ " is moving");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    // yazdirmak ıcın toStrıng cagırdık...
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    // parent class hazır.. chıld class daha kolay artık
    //once dog class...
}
/*
Task:
	Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()
	Dog extends Animal:
			bark()
	Cat extends Animal:
			scratch()
	Tiger extends Animal:
			roar()
	Fish extends Animal:
			swim()
	...
 */