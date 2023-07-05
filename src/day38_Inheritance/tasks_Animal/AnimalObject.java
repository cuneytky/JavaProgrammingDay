package day38_Inheritance.tasks_Animal;

public class AnimalObject {
    public static void main(String[] args) {

        Cat cat= new Cat("breeding","white","small",2,'M');
        System.out.println(cat);
        cat.eat();
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());

        System.out.println("----------------------");

        Dog dog = new Dog("breeding","black","middle",4,'F');
        System.out.println(dog);
        dog.eat();

        System.out.println("----------------------");

    }
}
