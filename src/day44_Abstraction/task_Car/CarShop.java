package day44_Abstraction.task_Car;

public class CarShop {

    public static void main(String[] args) {

        Audi audi=new Audi("A6",2010,100000,"Black");
        System.out.println(audi);
        audi.start();
        audi.drive();
        audi.autoPark();
        System.out.println(audi.getClass());
        System.out.println("-------------------------------");

        BMW bmw = new BMW("A",2020,110000,"red");
        System.out.println(bmw);
        bmw.drive();
        bmw.start();
        System.out.println("-------------------------------");

        CydeoCar cydeoCar = new CydeoCar("AA",2023,200000,"white");
        System.out.println(cydeoCar);
        cydeoCar.autoPark();
        cydeoCar.drive();
        cydeoCar.fly();
        cydeoCar.selfDrive();
        cydeoCar.start();

        System.out.println("-------------------------------");

        Tesla tesla = new Tesla("T",2023,500,"gray");
        System.out.println(tesla);
        tesla.selfDrive();
        tesla.autoPark();
        tesla.start();
        tesla.drive();

        System.out.println("-------------------------------");





    }

}
