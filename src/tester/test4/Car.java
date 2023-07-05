package tester.test4;

public class Car extends Vehicle implements Convertible{


    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Car accelerating to "+ speed+" km/h.");
    }

    @Override
    public void openRoof() {
        System.out.println("Opening the car roof.");

    }

}
