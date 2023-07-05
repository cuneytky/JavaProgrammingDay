package day44_Abstraction.task_Car;

public class Mercedes extends Car implements AutoPark{
    public Mercedes( String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Mercedes has a auto park");
    }

    @Override
    public void start() {
        System.out.println("Mercedes has a start");
    }

    @Override
    public void drive() {
        System.out.println("Mercedes has a drive");
    }
}
