package tester.test2;

public class motor extends Vehicle{
    @Override
    public void start() {
        System.out.println("motor started.");
    }

    @Override
    public void stop() {
        System.out.println("motor stopped.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Motorcycle accelerating to "+speed+" km/h.");
    }
}
