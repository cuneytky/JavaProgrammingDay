package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {

        System.out.println(Circle.name);// Circle__ circle ekli ama diğerleri ona baglı geldı
        System.out.println(pi); //3.14__sadece pi import ettik kendi geldi


    }

}
