package day44_Abstraction.task_Car;

public class Toyota extends Car{

    public Toyota( String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota has a start");
    }

    @Override
    public void drive() {
        System.out.println("Toyota has a driving");
    }
}
