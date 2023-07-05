package day44_Abstraction.task_Device;

public class Samsung extends Phone implements downloadable,AndroidApps{

    public Samsung(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" download App");
    }
}
