package day47_Polymorphism;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Person;
import day43_Abstraction.employeeTask.Tester;
import day44_Abstraction.animal_Task.Animal;
import day44_Abstraction.animal_Task.Cat;
import day44_Abstraction.animal_Task.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;
public class ReferenceTypeCastings {
    public static void main(String[] args) {

        //Shape shape = (Shape) new Circle(4); upcasting   (Shape) yazmasakda olur
        Shape shape =  new Circle(4);   //upcasting

        Dog dog2= new Dog("asd",'M',3,"Large","black");
        Dog dog3= dog2;//  --> bunu atayabıldık :larger tan smallere

       // Animal animal = new Dog("Husky",'M',4,"Small","red");  //upcasting
        Animal animal = (Animal) new Dog("Husky",'M',4,"Small","red");  //upcasting

        // Dog dog= animal;     //  direk atayamadık
        Dog dog= (Dog) animal;  //  --> atayabıldık: smallerdan larger a  ""downCasting""

        System.out.println(animal.getBreed()); // Husky
        System.out.println(dog.getBreed());    //Husky --> 1 dog same anımal

        dog.bark(); // Dog is barking --> bu hata vermedı barkı tanıdı
        //animal.bark(); hata verdi.(bark'ı tanımadı) unique method cunku
        ( (Dog) animal ).bark(); // Dog is barking --> hatasız calıstırdık.

        Shape shape1= new Square(5);
        //System.out.println(shape1.getSide); // get side tanımadı
        System.out.println( ((Square) shape1).getSide() ); //tanıttık kısa yolu ile ama yapamadım bak!!!

        System.out.println("--------------------------------------");

        Animal animal1= new Cat("aa",'F',2,"small","red");
        //animal1.meow();// tanımadı
        ( (Cat) animal1 ).meow(); // --> tanıttık

        Cat cat = (Cat) animal1;// kısa yola (Cat) getirip hatayı giderip tanıttık.
        cat.meow(); // --> sımdı tanıttıgımız ıcın dırek hatasız kullandık (meow) ozelliğini

       ( (Dog) animal1 ).bark();// ClassCastException: hatası verdi

        System.out.println("--------------------------------------");
        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ( (Tester)employee ).bugReport(); // Ali is creating bug reports cıktısı verdi--ok

        //  ( (Tester)employee ).unitTest();

        //  ( (Developer)employee ).unitTest();

        //  Driver driver = (Driver) employee;  // line 1
        Person person = (Person) employee; // line 2
        //    Teacher teacher = (Teacher) employee; // line 3

        System.out.println("--------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
        // ( (Cube)s1 ).volume(); --> hata verdi cunku tanımlayamadı--ClassCastException: hatası verdi
    }
}
