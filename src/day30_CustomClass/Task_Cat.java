package day30_CustomClass;

public class Task_Cat {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo() {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public String toString() {
        return "Task_cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void play(){
        System.out.println(name+" is playing");
    }


}
/*
Attributes: (oznitelikler)
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....

 */