package day44_Abstraction.task_Device;

public class Iphone extends Phone implements downloadable,AppleApps{
    public Iphone( String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Iphone", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" has download App");
    }
}
