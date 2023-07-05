package day36_Inheritance.animalTask;

// Animal class taki tum oz tek tek gırmıyoruz. extend ile dahil ediyoruz
// (import odunc (borrow) alır extend ona ait oluyor.)
/*import vs extends:    import: borrowing
                        extends: owning
 */
//  dog classa ait özel nitelikleri ekleriz...

public class Dog extends Animal  { //Dog Is An animal
    //      child        parent
    public void bark(){
        System.out.println(name + " is barking");
    } // buradaki name dog name
}

/*
    dog:
        6 variables
        7 methods
 */