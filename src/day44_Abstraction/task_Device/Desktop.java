package day44_Abstraction.task_Device;

public class Desktop extends Computer{


    public Desktop( String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Desktop", model, price, color, size, hasBattery, hasPowerButton);
    }

    public void good(){
        System.out.println(getBrand()+" is good");
    }
}
