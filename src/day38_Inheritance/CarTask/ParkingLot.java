package day38_Inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray", 123456);


        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

        BMW bmw = new BMW("X5", 2020, 67350, "black", 12000);



        toyota.start(); //Twist the key to ignition to start Toyota Camry
        tesla.start();  //Say "Start" to start Tesla Model S
        bmw.start();    //Call mechanic to jump start BMW X5


    }

}
