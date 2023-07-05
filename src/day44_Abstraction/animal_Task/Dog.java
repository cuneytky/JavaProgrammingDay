package day44_Abstraction.animal_Task;

public final class Dog extends Animal implements Playable{

    // implements ile Playable ozelliğini kullanabılır olduk. imlement edince hata verdi,
    // çünkü implement ettiğimiz dosyanın ozelliğini yazmamızı ister bizde
    // play() ile özellik body si oluşturduk.
    // olusturmakiçin more visible için more vsible methot kullanmalıyız.


    public Dog( String breed, char gender, int age, String size, String color) {
        super("Dog", breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }


    public void eat() {
        System.out.println(getName()+" eats Pizza");
    }

    public void play(){
        System.out.println(getName() +" is playing with ball");
    }


}
/*
Properties of Interface
• Variables are static & final by default
• Interface can have static methods, abstract methods and default methods only
• Public is the only access modifier that can be used in interface and given by default
• Abstract keyword is given by default to the abstract methods of interface

What Interface can not have?
• An interface can not have instance variables
• An interface can not have instance methods
• An interface can not have constructors
• An interface can not have blocks
• We can not create objects from interface

Implementing the Interface
• Class can extend only one superclass, but java allows a class to
implement multiple interfaces
• Implements keyword is used to inherit from interface(s)
• When a class implements multiple interfaces, it must implement
(override) all the abstract methods

          Abstract Class              vs               Interface
Can not be instantiated                             Can not be instantiated
Multiple inheritance is not allowed                 Multiple inheritance is allowed
Can have constructor                                Can not have constructor
Can have instance, static and abstract methods      Can have static, abstract and default methods
Can have instance and static variables              Can only have static variable (final by default)
Can not be final                                    Can not be final
Can use other access modifiers than public          Can not use other access modifiers than public


 */