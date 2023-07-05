package day44_Abstraction.task_Car;

public class Honda extends Car{

    public Honda( String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Honda has a start");
    }

    @Override
    public void drive() {
        System.out.println("Honda has a driving");
    }
}
