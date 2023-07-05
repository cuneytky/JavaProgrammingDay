package day44_Abstraction.task_Device;

public class Google extends Phone implements downloadable,AndroidApps{


    public Google( String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" has a download App");
    }
}
