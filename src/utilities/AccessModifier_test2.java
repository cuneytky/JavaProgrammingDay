package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_test2 extends ProtectedAccessModifier {
    public static void main(String[] args) {

       // System.out.println(AccessModifier_test2.name1);// default no visible outside the package
        System.out.println(AccessModifier_test2.name2);// protected visible outside the package in subclass ONLY


        //AccessModifier_test2.method1();// err verdi gorunmedı. default paketın dısında subclass da olsa gorunmez
        AccessModifier_test2.method2(); // protekted paketin dısında sadece subclass aaltında gorulebılır.

    }
}
