package day46_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animal_Task.Animal;
import day44_Abstraction.animal_Task.Cat;
import day44_Abstraction.animal_Task.Dog;
import day44_Abstraction.animal_Task.Playable;
import day45_Abstraction.shape.*;



import java.util.ArrayList;

public class day46_PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon"; // bunlar sadece tek değer alıyor
                                    // bunları arrray altında virleştirmek için
        Integer n1 = 2;             // bunları kapsayan ust sınıfa gideriz.
                                   // hepsi object altında array yazınca hatasız tum sınıfları aldı
        Double n2 = 5.5;           // ama bu durum işlem yapmak ıcın ıyı değil

        Boolean r1 = true;

        Object[] array = {str, n1, n2, r1, new Circle(4) , new Square(7)};

          /*
            WebDriver driver;
            driver = new ChromeDriver();
            driver = new FireFoxDriver();
         */
/*
        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Tester>cydeoEmployee= new ArrayList<>();

        cydeoEmployee.add(tester);
        cydeoEmployee.add(developer);
        cydeoEmployee.add(teacher);
        cydeoEmployee.add(driver);

 */
   // bu şekilde hata verir cunku bunlar kardes ılşkılerı yok bunları perent
        // altında yazarsak sıkıntı olmayacak;

        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Employee>cydeoEmployee= new ArrayList<>();

        cydeoEmployee.add(tester);
        cydeoEmployee.add(developer);
        cydeoEmployee.add(teacher);
        cydeoEmployee.add(driver);

        // Employee burada olur ama car ya da shape ile olmaz cunku onlarla bır ılskı yok
        // ArrayList<Person>cydeoEmployee= new ArrayList<>(); --> dersem olur cunku person grandparent.

        System.out.println("------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        employee.work(); //Ali is testing the application

        Employee employee1= new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        employee1.work(); // Alex is developing application
        //employee1.unitTest();  --> bu hata verdı cuku sadece developerda olan method cagırdık.
                               //  polymorphism sadece parenttan oz alabılır.

        // burada work() hangısı ıcın uygulandıysa onu calıstırdı.(wok employee de tanımlanmıs abstract method ıdı)

         /*
            WebDriver driver1 = new ChromeDriver();
            WebDriver driver2 = new ChromeDriver();

            driver1.get(amazon)
            driver2.get(google)

            Animal animal = new Dog();
            animal.drink()

            Animal animal = new Cat()
            animal.drink()

            Animal animal = new Tiger()
            animal.drink()
         */

        Animal animal= new Dog("Max", 'M', 3, "Small",  "White");
        animal.drink();
        animal.eat();
        // animal.play();
        //  animal.bark();

        Playable animal2 = new Dog("Max",  'M', 3, "Small",  "White");
        System.out.println(animal2.isFriendly);
        animal2.play();
        //  animal2.drink();
        //  animal2.eat();


        Animal animal3 = new Cat("Max",  'M', 3, "Small",  "White");

        Shape shape = new Circle(5);
        shape.area();

        //  System.out.println( shape.getRadius());
        // System.out.println( shape.PI);

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isCircle = " + isCircle);

  /*
        WebDriver driver:

            if(driver instanceof Chrome){
                Chrome browser will open
            }else if(driver instanceof firefox){
                Firefox browser will open
            }

            ...

         */





    }

}
