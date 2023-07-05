package day39_Recap;

public class MethodOverLoading {
    private void method1(){

    }

    // MethodOverLoading parametresi mutlaka farklı olmalı
    // fakat
    // MethodOverRiding parametresi mutlaka AYNI olmalı
    private int method1(int a){
        return a;
    }
}
/*
Method Overloading               -------                Method Overriding
Method overloading is performed within class   :     Method overriding occurs in two classes that
                                               :                           have IS-A relationship
parameter must be different                         parameter must be same
Access specifier can be changed                :     Access specifier must not be more restrictive
                                                                    than original method
private and final methods can be overloaded       private and final methods can not be overridden
Return type of method does not matter, it can     Return type must be same in method overriding
be same or different
 */