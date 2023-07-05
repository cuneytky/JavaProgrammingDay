package day44_Abstraction.task_Device;

public class Phone extends Device{


    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" has a turn On Phone");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" has a turn Off Phone");
    }

    public void call(long phoneNumber){
        System.out.println("Call Number:"+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(phoneNumber+" is text");
    }



}
