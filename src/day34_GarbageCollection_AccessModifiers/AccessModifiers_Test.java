package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println( AccessModifiers.publicData ); //100
        System.out.println( AccessModifiers.defaultData ); //200
        //    System.out.println( AccessModifiers.privateData ); // private is not visible outside the class

        AccessModifiers.method1(); //Public
        AccessModifiers.method2(); //Default
        //    AccessModifiers.method3(); // private is not visible outside the class


    }


}
/*
  ...utility altında da denedik hangileirne ulasabiliriz...
package utilities;
import day34_GarbageCollection_AccessModifiers.AccessModifiers;
public class AccessModifiers_Test2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData);// other package under so not visible
        //System.out.println(AccessModifiers.privateData);//only one class visible
    }
}
 */