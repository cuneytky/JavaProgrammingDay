package day44_Abstraction.animal_Task;

public interface Playable { // bunu class olusturur gıbı yapıp ınterface tıklayarak olusturduk.
    // interface not a class!!! but parents
    // interface class tan farkı--> mutlaka public olmalı cunku parent ve sub class gormeli

    // --> public abstract void play();   // public ve abstract gri verdi cunku kullanmaya gerek yok
                                         // cdk 8 oncesi gerekirdi ama sonrasında default olarak gelir.
    void play(); // abstract by default --> mutlaka public

   // static boolean isFriendly; --> bu hata verdi cunku interface finally dir

    // static and final by default

    boolean isFriendly = true; // --> bu hata vermedi cunku her playable is frendly olur dedik.
                                // ama burada da static kullanmaya gerek yok

    // static method variable oldugundan kullanılabılır
    /*
    public static void method1(){
        System.out.println(isFriendly);
    }

     */


}
