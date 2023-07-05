package day44_Abstraction.task_Car;

public class Audi extends Car implements AutoPark{


    public Audi( String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Audi has a auto park");
    }

    @Override
    public void start() {
        System.out.println("Audi has a start");
    }

    @Override
    public void drive() {
        System.out.println("Audi has a drive");
    }
}
