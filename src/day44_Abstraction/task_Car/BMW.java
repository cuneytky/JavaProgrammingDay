package day44_Abstraction.task_Car;

public class BMW extends Car{

    public BMW( String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("BMW has a start");
    }

    @Override
    public void drive() {
        System.out.println("BMW has a driving");
    }
}
