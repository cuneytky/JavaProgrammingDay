package day44_Abstraction.task_Device;

public class DeviceShop {

    public static void main(String[] args) {

        Computer computer = new Computer("computer","b",100,"ss","A5",true,true);
        System.out.println(computer);
        computer.turnOff();
        computer.turnOn();

        System.out.println("-----------------------");

        Laptop laptop = new Laptop("a7",50,"gray","S5",true,true);
        laptop.good();
        System.out.println(laptop);

        System.out.println("-----------------------");

        Iphone iphone = new Iphone("15",500,"red","15",true,false);
        System.out.println(iphone);
        iphone.downloadApp();
        iphone.getColor();
        iphone.turnOff();
        iphone.turnOn();
        iphone.call(125);


        System.out.println("-----------------------");

        Samsung samsung = new Samsung("A55",700,"white","17i",false,false);
        System.out.println(samsung);
        samsung.downloadApp();
        samsung.turnOff();
        samsung.turnOn();
        samsung.text(555);


        System.out.println("-----------------------");

    }

}
