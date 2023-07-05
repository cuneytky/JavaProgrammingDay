package day44_Abstraction.task_Device;

public class PersonalComputer extends Computer {

    public PersonalComputer( String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("PersonalComputer", model, price, color, size, hasBattery, hasPowerButton);
    }
    public void good(){
        System.out.println(getBrand()+" is good");
    }
}
