package day39_Recap.Task_Device;

public class TV extends Device{
    public TV(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void channelUp(){
        System.out.println("TV has channel Up");
    }
    public void channelDown(){
        System.out.println("TV has channel Down");
    }

}
/*
	4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()
 */
