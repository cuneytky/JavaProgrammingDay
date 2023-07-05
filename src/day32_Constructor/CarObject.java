package day32_Constructor;

public class CarObject {

    public static void main(String[] args) {

        Car car1= new Car("toyota");
        Car car2 = new Car("honda","civic");
        Car car3 = new Car("lexus","RX350",2021);
        Car car4 = new Car("BMW","X6",2020,50000);
        Car car5 = new Car("Tesla","model 3",2019,7000,"white");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        /*
        Car{brand='toyota', model='null', color='null', year=0, price= $0.0}
        Car{brand='honda', model='civic', color='null', year=0, price= $0.0}
        Car{brand='lexus', model='RX350', color='null', year=2021, price= $0.0}
        Car{brand='BMW', model='X6', color='null', year=2020, price= $50000.0}
        Car{brand='Tesla', model='model 3', color='white', year=2019, price= $7000.0}
         */



    }

}
