package day44_Abstraction.task_Car;

public class Tesla extends Car implements AutoPark, AutoPilot {
    public Tesla( String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Tesla has a auto park");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla has a self driver");
    }

    @Override
    public void start() {
        System.out.println("Tesla has a start");
    }

    @Override
    public void drive() {
        System.out.println("Tesla has a driving");
    }
}
//9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces
