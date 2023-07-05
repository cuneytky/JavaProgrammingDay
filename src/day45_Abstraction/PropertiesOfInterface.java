package day45_Abstraction;

public class PropertiesOfInterface {

    // 1 - instance variable
    //int a;
    int a = 100;           // static & final by default

    // 2 - static variable
    // static int b;
    static int b = 200;     // final by default


    /*  3 - constructor
    public PropertiesOfInterface(int a){
        this.a =a;
    }
    */

    /* 4 - static blok
    static{
        b = 100;
    }
    */

    /* 5 - instance method
    public void method1(){
        System.out.println("Instance method");
    }
     */

    // 6 - static method
    static void method2(){
        System.out.println("Static method");
    }
    // *** buraya kadar (6 tane si) "public class PropertiesOfInterface" regular(constant)
     // özelliklerden olusur..

    // 7- sonra abstract class için:
    // ismi "public abstract class PropertiesOfInterface" yaparak abstract class olusturduk
    //
    // 8- sonra abstract method için:
    //   public abstract void method3(); --> ile yapılır

    // 9 - interface için:
    //"public interface PropertiesOfInterface" yaptık bu durumda:
    // - interface static variable olamayacagı için err verdi
    // - interface static method   olamayacagı için err verdi
    // - instance method need to object but interface object can not soo err verdi
    // - interface final olduğundan 1 ve 2 de a; ya da b; yapaamayız deger vermeliyiz ki interface err vermesin
    // - interface encapsulation olamaz cunku interface private olamaz public olur
    // - interface class final olamaz...

    // - interface static method ve abstract method olur
    // - interface default method olur:
    /*
         default void method4(){
             System.out.println("Default method");
    }
     */
    /*
    What interface can have?
Variables: static & final variable only
Methods: static, abstract and default methods only
     */

}
