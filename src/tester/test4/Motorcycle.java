package tester.test4;

public class Motorcycle extends Vehicle{
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Motorcycle accelerating to "+ speed+" km/h.");
    }
}
