package day40_FinalKeyword;

public class ProtectedAccessModifier {
    static String name1 = "Cydeo"; //default access modifier  // aynı package ve aynı class ta goruruz
                                                              // başka yerde goremeyiz...
    protected static String name2 = "WoodenSpoon"; // protected

    // default ve protected için utility paketının altında class oluturduk:


    //     ==>   1. sınde 2 sının de not visible oldugunu gorduk.
    /*
    package utilities;
import day40_FinalKeyword.ProtectedAccessModifier;
public class AccessModifiers {
    public static void main(String[] args) {
        //System.out.println(ProtectedAccessModifier.name1); //default is not visible outside the package
        //System.out.println(ProtectedAccessModifier.name2); // protected is not always visible outside the package
    }
}
     */
    //    ==>   2. sınde ıse sub class altında sadece protecdt visible oldu ama default yıne not vısıble
    /*

*** ===> bu aynı zamanda ınterview sorusu??? default ve protected arası farkı nedir?????

    package utilities;
import day40_FinalKeyword.ProtectedAccessModifier;
public class AccessModifier_test2 extends ProtectedAccessModifier {
    public static void main(String[] args) {
       // System.out.println(AccessModifier_test2.name1);    // default no visible outside the package
        System.out.println(AccessModifier_test2.name2);      // protected visible outside the package in subclass ONLY

        // methodlarda durum:
         AccessModifier_test2.method1();       // err verdi gorunmedı. default paketın dısında subclass da olsa gorunmez
        AccessModifier_test2.method2();         // protekted paketin dısında sadece subclass aaltında gorulebılır.
    }
}
     */
    //******************************************************

    // sımdı de 2 method olusturup aynı durumu kontrol ettık:
    // ==>  method 2 subclass altında visible ama method 1 not visible


    static void method1(){
    }
    protected static void method2(){
    }

}
