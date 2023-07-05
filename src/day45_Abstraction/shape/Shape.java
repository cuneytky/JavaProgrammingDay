package day45_Abstraction.shape;
public abstract class Shape {
    private final String name;                  // --> instance variable
    public Shape(String name) {
        this.name = name;
    }  // --> constructors
             // this.name = getClass().getSimpleName(); --> ismi toString ya da bu sekilde verebılırız
    public String getName() {
        return name;
    }        // -->  instance method
    public abstract double area();                // -->   abstract method
    public abstract double perimeter();           // -->    abstract method
    @Override
    public String toString() {
        return
                "name= '" + name + '\'' +
                " Area= '" + area() + '\'' +
                " Perimeter= '" + perimeter() + '\'' ;
    }
}
