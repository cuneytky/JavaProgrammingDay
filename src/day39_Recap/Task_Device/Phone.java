package day39_Recap.Task_Device;

public class Phone extends Device {

    public Phone(String brand, String model, double price) {
        super(brand, model, price);
    }
    public void call(long phoneNum){
        System.out.println("Phone number: "+phoneNum);
    }
    public void text(long phoneNum){
        System.out.println(phoneNum+ " is calling(text)");
    }
}
/*
2. Create a subclass of Device named Phone:
				Extra Methods:
						call(long phoneNum), text(long phoneNum)
 */