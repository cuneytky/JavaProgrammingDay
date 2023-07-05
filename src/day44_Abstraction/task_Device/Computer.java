package day44_Abstraction.task_Device;

public class Computer extends Device{

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" has a turn On computer");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" has a turn Off computer");
    }
}
