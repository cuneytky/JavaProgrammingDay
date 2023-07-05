package day40_FinalKeyword;

public final class Cat extends Animal {

    public Cat(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }
// cat final olmasa dog  parent yapılırdı ama fınal ve dog bark oz var
    // gray color unnecessary anlamına gelir.

    // fınal overrıdıng yapılamaz ama
    // fınal overloadıng yapılabılır

}