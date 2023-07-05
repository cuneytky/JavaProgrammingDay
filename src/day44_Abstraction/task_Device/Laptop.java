package day44_Abstraction.task_Device;

public class Laptop extends Computer{

    public Laptop( String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Laptop", model, price, color, size, hasBattery, hasPowerButton);
    }
    public void good(){
        System.out.println(getBrand()+" is good");
    }

}
