package day44_Abstraction.task_Car;

public class Nio extends Car implements AutoPark, AutoPilot{
    public Nio( String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Nio has a auto park");
    }

    @Override
    public void selfDrive() {
        System.out.println("Nio has a self drive");
    }

    @Override
    public void start() {
        System.out.println("Nio has a star");
    }

    @Override
    public void drive() {
        System.out.println("Nio has a drivng");
    }
}
