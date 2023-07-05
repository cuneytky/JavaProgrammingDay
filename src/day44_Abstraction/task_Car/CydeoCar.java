package day44_Abstraction.task_Car;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar( String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("cydeoCar has a auto park");
    }

    @Override
    public void selfDrive() {
        System.out.println("cydeoCar has a self driver");
    }

    @Override
    public void start() {
        System.out.println("cydeoCar has a start");
    }

    @Override
    public void drive() {
        System.out.println("cydeoCar has a auto driver");
    }

    @Override
    public void fly() {
        System.out.println("cydeoCar has a fling");
    }
}
